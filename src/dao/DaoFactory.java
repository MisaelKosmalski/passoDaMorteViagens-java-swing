package dao;

import db.DB;
import dao.impl.TravelerDaoJDBC;

public class DaoFactory {
    
    public static TravelerDao createTravelerDao() {

        return new TravelerDaoJDBC(DB.getConnection());

    }
    
}
