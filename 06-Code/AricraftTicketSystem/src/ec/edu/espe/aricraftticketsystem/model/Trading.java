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
public class Trading {
    private Ticket ticket;
    private Payment payment;
    private boolean voucher;

    public Trading(Ticket ticket, Payment payment, boolean voucher) {
        this.ticket = ticket;
        this.payment = payment;
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return ticket + "," + payment + "," + voucher;
    }

    /**
     * @return the ticket
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
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
     * @return the voucher
     */
    public boolean isVoucher() {
        return voucher;
    }

    /**
     * @param voucher the voucher to set
     */
    public void setVoucher(boolean voucher) {
        this.voucher = voucher;
    }
}
