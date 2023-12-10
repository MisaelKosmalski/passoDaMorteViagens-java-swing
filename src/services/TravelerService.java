package services;

import java.util.List;

import dao.TravelerDao;
import dao.DaoFactory;
import entities.Traveler;

public class TravelerService {
    
    public TravelerService() {
    }
    
    public TravelerDao dao = DaoFactory.createTravelerDao();
    
    public List<Traveler> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Traveler obj) {

        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }

    }

    public void delete(int id) {
        dao.delete(id);
    }
    
}
