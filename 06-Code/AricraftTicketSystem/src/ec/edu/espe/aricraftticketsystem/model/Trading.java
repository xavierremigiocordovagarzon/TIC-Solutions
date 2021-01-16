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

    public Trading(Ticket ticket, Payment payment, boolean voucher) {
        this.ticket = ticket;
        this.payment = payment;

    }

    public Ticket generateTicket(int num, Seat seatUse, Payment paymentUse, String setLocationUse) {//received codeconter

        int codeUse = 9999;
        codeUse = codeUse + num;
        seatUse.getLocation();
        seatUse.getNumber();
        paymentUse.getPrice();

        Ticket ticketUse = new Ticket(codeUse, seatUse, paymentUse.getPrice(), setLocationUse);

        return ticketUse;
    }

    public Payment realizePayment(String method, float pay) {//received payment method

        float subtotal = 600.00F;
        float vat = subtotal * 0.12F;
        float priceUse = vat + subtotal;
        Payment paymentUse = new Payment(method, priceUse, vat, subtotal);//page

        return paymentUse;
    }

    @Override
    public String toString() {
        return ticket + ";" + payment;
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

}
