/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seatreservation;

/**
 *
 * @author user
 */
public class SeatReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ConcertHall concertHall = new ConcertHall(10); //create a concert hall with 10 seats
    
        //create and start five booking clerks
        for(int i=0; i<5; i++){
            BookingClerk clerk = new BookingClerk(concertHall);
            clerk.start();
        }
    }
    
}
