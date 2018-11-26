package unitedairline;

import java.util.Scanner;
/* Author: Marcus Mitchell
   Date: 11/05/18
   Description: This is an Airline Reservation System that allows agents to view customer information regarding flights 310 and 320.
*/
public class UnitedAirline2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to United Airlines!");
        Scanner input = new Scanner(System.in);
        boolean exe = true;
        
        Airplane flight3101 = new Airplane(310, "Greensboro", "Newark", "December 6", "7:00 AM", 20);
        Airplane flight3102 = new Airplane(310, "Greensboro", "Newark", "December 6", "2:00 PM", 20);

        Airplane flight3201 = new Airplane(320, "Newark", "Greensboro", "December 6", "7:00 AM", 20);
        Airplane flight3202 = new Airplane(320, "Newark", "Greensboro", "December 6", "2:00 PM", 20);


        while(exe) {
            System.out.print("Which flight would you like? Enter '310' or '320': ");
            int Num = input.nextInt();

            System.out.print("Enter your class. Type 'Economy', 'Business', or 'First': ");
            String Class = input.next();

            System.out.println("Enter your first name:");
            String name = input.next();
            
            System.out.print("Select a depature time. Enter '7' (AM) or '2' (PM)");
            int time = input.nextInt();

            
            if (Num == 310 && time == 7) {
                try{
                flight3101.BuyTicket(name, Class);
                }catch(allTicketSold e){
                    System.out.println(e.getMessage());
                }
            } else if(Num == 310 && time == 2){
                try{
                flight3102.BuyTicket(name, Class);
                }catch(allTicketSold e){
                    System.out.println(e.getMessage());
                }
            } else if(Num == 320 && time == 7){
                try{
                flight3201.BuyTicket(name, Class);
                }catch(allTicketSold e){
                    System.out.println(e.getMessage());
                }
            } else if(Num == 320 && time == 2){
                try{
                    flight3202.BuyTicket(name, Class);
                }catch(allTicketSold e){
                    System.out.println(e.getMessage());
                }
            }
            
            System.out.print("Would you like to return a ticket? Enter 'yes' or 'no'.");
            String no;
            String in = input.next();
            if (in != "no"){
                if (Num == 310 && time == 7){
                    flight3101.returnTicket();
                }else if(Num == 310 && time == 2){
                    flight3102.returnTicket();
                }else if(Num == 320 && time == 7){
                    flight3201.returnTicket();
                }else if(Num == 320 && time == 2){
                    flight3202.returnTicket();
                }
            }
            System.exit(0);

        }

        System.out.println("The tickets for flight 310 #1: ");
        flight3101.print();
        
        System.out.println("The tickets for flight 320 #2: ");
        flight3102.print();

        System.out.println("The tickets for flight 320 #1: ");
        flight3201.print();
        
        System.out.println("The tickets for flight 320 #2: ");
        flight3202.print();
    }
    
}
