package GUI;

import entities.Traveler;
import services.TravelerService;

import java.util.List;

public class TravelerController {
    
    public TravelerController(){
    }
    
    private TravelerService service;
    
    private void setService(TravelerService service) {
        this.service = service;
    }
    
    public List<Traveler> getListTraveler() {
        
        setService(new TravelerService());

        List<Traveler> list = service.findAll();

        return list;

    }
    
    public void insert(Traveler traveler) {

        setService(new TravelerService());
        service.saveOrUpdate(traveler);

    }
    
    public void delete(int id) {

        setService(new TravelerService());
        service.delete(id);
        
    }
    
}