package unitedairline;

/* Author: Marcus Mitchell
   Date: 11/05/18
   Description: This is an Airline Reservation System that allows agents to view customer information regarding flights 310 and 320.
*/


public class Flight extends Ticket{


    //static final int seats = 10;

    private String departureTime, departuredate, arrivalTime;
    private int flightNum;
    private String orginAirport;
    private String destinationAirport;
    private int seat, price;
    //private ArrayList tickets = new ArrayList();

    public Flight(String name, String flightClass, int flightNum, int seat, String departuredate, String depart, String arrive, String orgin, String dest) {
        super(name, flightClass);
        this.orginAirport = orgin;
        this.destinationAirport = dest;
        this.departureTime = depart;
        this.arrivalTime = arrive;
        this.flightNum = flightNum;
        this.seat = seat;
        this.departuredate = departuredate;
        this.price = super.Price();
    }    


    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
         this.price = price;
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


    public void setDepartureTime(String depart) {
        this.departureTime = depart;
    }

    public void setArrivalTime(String arrive){
        this.arrivalTime = arrive;
    }

    public void setOrginAirport(String origin) {
        this.orginAirport = origin;
    }

    public void setDestinationAirport(String dest) {
        this.destinationAirport = dest;
    }

    public String getDepartureDate(){
        return departuredate;
    }

    public void setDepartureDate(String departuredate){
        this.departuredate = departuredate;
    }

    public int getFlightNum(){
        return flightNum;
    }

    public void setFlightNum(int flightNum){
        this.flightNum = flightNum;
    }

    /*
    public String toString() {
        return "From: " + getDepartureTime() + "To: " + getArrivalTime() + "FROM: " + getOriginAirport() + "TO: " + getDestinationAirport() + "\n";
    }
    */
}