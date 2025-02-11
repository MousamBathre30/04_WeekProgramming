package flightSchedulingsystem;

import java.util.ArrayList;
import java.util.List;

class FlightManager <T extends Number> {
    private List<Flight<T>> flights = new ArrayList<>();
    public void addFlight(Flight<T> flight){
        flights.add(flight);
    }
    public void displayAllFlights(){
        for(Flight<T> flight : flights){
            flight.displayFlightInfo();
        }
    }
}
