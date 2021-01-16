/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.aricraftticketsystem.model;

/**
 *
 * @author George
 */
public class Reservation {

    private String date;
    private String destination;
    private Ticket ticket;
    private Payment payment;

    public Reservation(String date, String destination, Ticket ticket, Payment payment) {
        this.date = date;
        this.destination = destination;
        this.ticket = ticket;
        this.payment = payment;
    }

    public Reservation consultTicket(String dateUse, String destinationUse, Ticket ticketUSe, Payment paymentUse) {
        Reservation reservationUse = new Reservation(dateUse, destinationUse, ticketUSe, paymentUse);
        return reservationUse;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return date + ";" + destination;
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

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
}
