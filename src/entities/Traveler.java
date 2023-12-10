package entities;

public class Traveler {
    
    private Integer id;
    private String name;
    private String cpf;
    private String numberPhone;
    private String boarding;
    private String destiny;

    public Traveler() {
    }

    public Traveler(Integer id, String name, String cpf, String numberPhone, String boarding, String destiny) {
        setId(id);
        setName(name);
        setCpf(cpf);
        setNumberPhone(numberPhone);
        setBoarding(boarding);
        setDestiny(destiny);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return numberPhone;
    }
    
    public void setBoarding(String boarding){
        this.boarding = boarding;
    }
    
    public String getBoarding(){
        return boarding;
    }
    
    public void setDestiny(String destiny){
        this.destiny = destiny;
    }
    
    public String getDestiny(){
        return destiny;
    }
    
}
