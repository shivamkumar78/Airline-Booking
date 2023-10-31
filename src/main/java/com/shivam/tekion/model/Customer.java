package com.shivam.tekion.model;

public class Customer {

    private String id;
    private String email;
    private System system;

    public boolean fixSeat(Flight flight,Seat seat){
       boolean isBooked= flight.airCraft.fixSeat(seat, this);
       
       if(isBooked){
       return true;
       }
       else
       return false;
    }

    public boolean cancelBooking(Flight flight){
        flight.cancelForCustomer(this);
        return true;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public System getSystem() {
        return system;
    }
    public void setSystem(System system) {
        this.system = system;
    }

}
