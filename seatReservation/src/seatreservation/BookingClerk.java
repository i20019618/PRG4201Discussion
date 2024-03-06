/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seatreservation;

import java.util.Random;

/**
 *
 * @author user
 */
public class BookingClerk extends Thread {
    private ConcertHall concertHall;
    private Random random;
    
    public BookingClerk(ConcertHall concertHall){
        this.concertHall = concertHall;
        this.random = new Random(); 
    }

    @Override
    public void run(){
        int seatNumber = random.nextInt(concertHall.getTotalSeats()) + 1; //random seat number
        
        if(concertHall.bookSeat(seatNumber)){
            System.out.println("Clerk " + Thread.currentThread().getId() + " booked seat " + seatNumber + " successfully.");
        }else{
            System.out.println("Clerk " + Thread.currentThread().getId() + " failed to boook seat " + seatNumber + " (already booked).");
        }
    }
}
