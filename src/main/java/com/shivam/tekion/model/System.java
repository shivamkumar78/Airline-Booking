package com.shivam.tekion.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class System{

    private List<Flight>flights;
    private static System system=null;

    private System(){}

    public static System getInstance(){

        if(system==null)
        system=new System();
        return system;

    }
    
    public List<Flight> fetchFlights(String src,String dest,Date date){

        List<Flight>filteredFlights=new ArrayList<Flight>();

        for(Flight flight:flights){

            if(flight.date==date&&flight.src==src&&flight.dest==dest){
                filteredFlights.add(flight);
            }
        }
        return filteredFlights;
    }

    public boolean fixSeat(Aircraft aircraft,Seat seat){
        aircraft.fixSeat(seat,seat.getCustomer());
        return true;
    }
    
}



