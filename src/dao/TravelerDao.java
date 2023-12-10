package dao;

import java.util.List;

import entities.Traveler;

public interface TravelerDao {
    
    void insert(Traveler obj);
    List <Traveler> findAll();
    void update(Traveler obj);
    void delete (int id);
    
}
