/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.aircraftticketsystem.model;

/**
 *
 * @author Xavier Cordova ESPE-DCCO
 */
public class Reservation {
    private int reservedseat;
    private String time;
    private Payment payment;
    private String destination;
    
    public void consultReservation(){
        
    }
    public void consultTicket(){
        
    }

    /**
     * @return the reservedseat
     */
    public int getReservedseat() {
        return reservedseat;
    }

    /**
     * @param reservedseat the reservedseat to set
     */
    public void setReservedseat(int reservedseat) {
        this.reservedseat = reservedseat;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the payment
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
}
