package unitedairline;

/* Author: Marcus Mitchell
   Date: 11/05/18
   Description: This is an Airline Reservation System that allows agents to view customer information regarding flights 310 and 320.
*/

public class Customer {

    private String firstName;
    private final String lastName;
    private String address;
    //private String phoneNum;
    //static ArrayList tickets = new ArrayList();

    public Customer(String name, String lName, String addy) {
        this.firstName = name;
        this.lastName = lName;
        //this.address = addy;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }

/*
    public String getLastName() {
        return lastName;
    }


    public String getAddress() {
        return address;
    }

    public ArrayList getTickets() {
        return tickets;
    }

    public void setAddress(String addy) {
        this.address = addy;
    }


    public void setTickets(String ticket) {
        tickets.add(ticket);
    }


    public String toString() {
        return "FIRST NAME: " + getFirstName() + "LAST NAME: " + getLastName() +
                "ADDRESS: " + getAddress() + "PHONE NUMBER: " + getPhoneNum();
    }
    */


}