package flightSchedulingsystem;

public class FlightSystem {

    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101 , "New York" , "London");
        Flight<String> flight2 = new Flight<>("AA202" , "Los Angeles" , "tokey");

        Booking<Integer> booking1 = new Booking<>(5001,flight1, "john");
        Booking<Integer> booking2 = new Booking<>(5002,flight2, "Cena");

        booking1.displayBookingInfo();
        System.out.println("-----------------------");
        booking2.displayBookingInfo();
        System.out.println("------------------------");
        System.out.println("---- Flight Management----");
        FlightManager<Integer> manager = new FlightManager<>();
        manager.addFlight(flight1);
        manager.displayAllFlights();

    }
}
