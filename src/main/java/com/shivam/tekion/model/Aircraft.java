package com.shivam.tekion.model;

import java.util.Map;

public class Aircraft {

    private Map<String,Seat>seats;

    public boolean fixSeat(Seat s,Customer c){

        if(s.getCustomer()!=null){
            return false;
        }
        s.setCustomer(c);
        return true;
    }

    public Map<String, Seat> getSeats() {
        return seats;
    }

    public void setSeats(Map<String, Seat> seats) {
        this.seats = seats;
    }

}
