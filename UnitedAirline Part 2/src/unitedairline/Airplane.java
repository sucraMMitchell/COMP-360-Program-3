package unitedairline;


/* Author: Marcus Mitchell
   Date: 11/05/18
   Description: This is an Airline Reservation System that allows agents to view customer information regarding flights 310 and 320.
*/


public class Airplane {


    private String departureTime, arrivalTime, destination, orgin, departuredate;
    private String orginAirport;
    private String destinationAirport;
    private Flight [] flights;
    private int flightNum;
    private int seat = 1;
    private Flight [] flight;
    
    public Airplane(int fNum, String orgin, String dest, String dTime, String arrive, int numSeats) {
        flights = new Flight[numSeats];
        this.flightNum = fNum;
        this.orgin = orgin;
        this.destination = dest;
        this.departureTime = dTime;
        this.arrivalTime = arrive;

    }

    public void BuyTicket(String name, String flightClass) throws allTicketSold{
        if (!airplaneFull()) {
            flights[seat] = new Flight(name, flightClass, this.flightNum, seat, this.orgin, this.destination, departuredate, this.departureTime, this.arrivalTime);
            seat++;
        }else{
            throw new allTicketSold("There are no seats available for flight number" + this.flightNum +"Leaving at this time:" + this.departureTime + "From this Airport:"+this.orginAirport +"To this Airport:"+ this.destinationAirport);
            //System.out.println("There are no seats available for the current settings you have selected.");
        }

    }

    public void print() {
        for (int m = 0; m < flights.length; m++) {
            if(flights[m] != null){
            System.out.println("Name: " + flights[m].getName() + " Date: " + flights[m].getDepartureDate() + " Time: " + flights[m].getDepartureTime() + "Seat: " + this.seat + " Price:" + flights[m].getPrice());
        
            }
        }
    }
    
    public boolean airplaneFull(){
        flight = flights;
        if(flight != null){
            return false;
        }
        return true;
    }
    
    public void returnTicket(){
        flights[seat] = null;
        seat--;
    }

    public String getDepartureTime() {
        return departureTime;
    }
    public String getArrivalTime(){
        return arrivalTime;
    }

    public String getOrginAirport() {
        return orginAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }
    
    public int getFlightNum(){
        return flightNum;
    }

    public void setFlightNum(int flightNum){
        this.flightNum = flightNum;
    }
    
    
    public String getDepartureDate(){
        return departuredate;
    }

    public void setDepartureDate(String departuredate){
        this.departuredate = departuredate;
    }
    
    public void setDepartureTime(String depart) {
        this.departureTime = depart;
    }

    public void setArrivalTime(String arrive){
        this.arrivalTime = arrive;
    }

}