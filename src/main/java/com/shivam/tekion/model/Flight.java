package com.shivam.tekion.model;

import java.sql.Date;
import java.sql.Time;
import java.util.Map;

public class Flight {

    public Date date;
    public String src;
    public String dest;
    public Aircraft airCraft;
    public Time start;
    public Time end;

    public Flight(Date date, String src, String dest, Aircraft airCraft, Time start, Time end) {
        this.date = date;
        this.src = src;
        this.dest = dest;
        this.airCraft = airCraft;
        this.start = start;
        this.end = end;
    }

    public boolean cancelForCustomer(Customer c){
        Map<String,Seat>seats=this.airCraft.getSeats();

         for(Seat seat:seats.values()){
            if(seat.getCustomer()==c){
                seat.setCustomer(null);
            }
        }
        return true;
    }

    


}
