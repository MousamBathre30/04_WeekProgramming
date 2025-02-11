package flightSchedulingsystem;

 class Booking <T> {
  private T boolingID;
  private Flight<?> flight;
  private String passengerName;

  public Booking(T bookingID, Flight<?> flight , String passengerName){
      this.boolingID = bookingID;
      this.flight = flight;
      this.passengerName = passengerName;
  }

  public void displayBookingInfo(){
      System.out.println("Booking ID: " + boolingID);
      System.out.println("Passenger: " + passengerName);
      flight.displayFlightInfo();
  }

}
