/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitedairline;

/**
 *
 * @author admin
 */
public class allTicketSold extends Exception{
    private String message = " ";
    
    public String getMessage(){
        return message;
    }
    
    public allTicketSold(String message){
        super(message);
    }
    
    public allTicketSold(){
        super();
    }
}
