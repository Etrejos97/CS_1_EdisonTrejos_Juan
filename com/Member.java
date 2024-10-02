package com;

// import java.util.HashMap;

public class Member extends ClubMember {
    private String suscriptionType;
    private double availableFounds;
    // private HashMap<String, AuthorizedPersons> authorizedPerson = new HashMap<>();
    
    public Member(String name, String id, String suscriptionType) {
        super(name,id);
        this.suscriptionType = suscriptionType;
        
    }

    public String getSuscriptionType() {
        return suscriptionType;
    }

    public void setSuscriptionType(String suscriptionType) {
        this.suscriptionType = suscriptionType;
    }

    public double getAvailableFounds() {
        return availableFounds;
    }

    public void setAvailableFounds(double availableFounds) {
        this.availableFounds = availableFounds;
    }

    @Override
    public String toString() {
        return  "Cedula: "+ id + "\nNombre: " + name  +
                ", \nTipo de suscripcion: " + suscriptionType;
    }
    
    
}

