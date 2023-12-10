package dao.impl;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;
import db.DbIntegrityException;
import dao.TravelerDao;
import entities.Traveler;

public class TravelerDaoJDBC implements TravelerDao{
    
    private Connection conn;

    public TravelerDaoJDBC(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public List<Traveler> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {

            st = conn.prepareStatement("SELECT * FROM passodamorte.traveler");
            rs = st.executeQuery();

            List<Traveler> list = new ArrayList<>();

            while (rs.next()) {

                Traveler obj = new Traveler();
                obj.setId(rs.getInt("id_traveler"));
                obj.setName(rs.getString("name_traveler"));
                obj.setCpf(rs.getString("cpf_traveler"));
                obj.setNumberPhone(rs.getString("number_traveler"));
                obj.setBoarding(rs.getString("boarding_traveler"));
                obj.setDestiny(rs.getString("destiny_traveler"));
                list.add(obj);
            }

            return list;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }

    }
    
    @Override
    public void insert(Traveler obj) {

        PreparedStatement st = null;

        try {

            st = conn.prepareStatement(
                    "INSERT INTO passodamorte.traveler"
                    + " (name_traveler, cpf_traveler, number_traveler, boarding_traveler, destiny_traveler)"
                    + " VALUES"
                    + " (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS
            );

            st.setString(1, obj.getName());
            st.setString(2, obj.getCpf());
            st.setString(3, obj.getNumberPhone());
            st.setString(4, obj.getBoarding());
            st.setString(5, obj.getDestiny());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {

                ResultSet rs = st.getGeneratedKeys();

                if (rs.next()) {

                    int id = rs.getInt(1);
                    obj.setId(id);
                }

            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }

    }
    
    @Override
    public void update(Traveler obj) {

        PreparedStatement st = null;

        try {

            st = conn.prepareStatement(
                    "UPDATE traveler SET name_traveler = ?,"
                    + " cpf_traveler = ?,"
                    + " number_traveler = ?,"
                    + " boarding_traveler = ?,"
                    + " destiny_traveler = ?"
                    + " WHERE id_traveler = ?"
            );

            st.setString(1, obj.getName());
            st.setString(2, obj.getCpf());
            st.setString(3, obj.getNumberPhone());
            st.setString(4, obj.getBoarding());
            st.setString(5, obj.getDestiny());
            st.setInt(6, obj.getId());

            st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }

    }
    
    @Override
    public void delete(int id) {

        PreparedStatement st = null;

        try {

            st = conn.prepareStatement(
                    "DELETE FROM passodamorte.traveler WHERE id_traveler = ?"
            );

            st.setInt(1, id);

            st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }

    }
    
}
