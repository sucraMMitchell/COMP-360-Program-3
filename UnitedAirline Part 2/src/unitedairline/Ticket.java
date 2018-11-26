
package unitedairline;


/* Author: Marcus Mitchell
   Date: 11/05/18
   Description: This is an Airline Reservation System that allows agents to view customer information regarding flights 310 and 320.
*/

public class Ticket {

    private String name;
    private String flightClass;
    private int price;

    public Ticket(String name, String flightClass) {
        this.name = name;
        this.flightClass = flightClass;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }


    public int Price(){
        switch(this.flightClass){
            case "Economy":
                price = 300;
                break;
            case "Business":
                price = 450;
                break;
            case "First":
                price = 900;
                break;
        }
        return price;
    }


}