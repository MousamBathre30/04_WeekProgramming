package flightSchedulingsystem;

class Flight <T> {
    private T flightNumber;
    private String departure;
    private String destination;

    public Flight(T flightNumber, String departure, String destination){
        this.flightNumber = flightNumber;
        this.departure = departure ;
        this.destination = destination;
    }
    public T getFlightNumber(){
        return  flightNumber;
    }
    public void displayFlightInfo(){
        System.out.println("Flight: " + flightNumber + " --> From : " + departure + " ----> To: " + destination);
    }
}
