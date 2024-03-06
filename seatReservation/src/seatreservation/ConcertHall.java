/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seatreservation;

import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author user
 */
public class ConcertHall {
    private final ConcurrentHashMap<Integer, Boolean> seats;
    
    public ConcertHall(int totalSeats){
        this.seats = new ConcurrentHashMap<>();
        for(int i=1; i<= totalSeats; i++){
            seats.put(i,false); //initialize all seats as unbooked
        }
    }
    
    public synchronized boolean bookSeat(int seatNumber){
        if(!seats.get(seatNumber)){ //check the seat available
            seats.put(seatNumber, true); //mark the seat as booked
            return true;
        }else{
            return false; //seat is booked
        }
    }
    
    public void displaySeats(){
        seats.forEach((seatNumber, isBooked) -> {
            System.out.println("Seat " + seatNumber + ": " + (isBooked? "Booked" : "Available"));
        });
    }
    
}
