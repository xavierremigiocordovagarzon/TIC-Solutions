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

    private String state;

    public Trading(String state) {
        this.state = "COMPRA VIGENTE";
    }

    @Override
    public String toString() {
        return getState();
    }
    
    
    
    public Ticket generateTicket(int num, Seat seatUse, Payment paymentUse, String setLocationUse) {//received codeconter

        int codeUse = 9999;
        codeUse = codeUse + num;
        seatUse.getLocation();
        seatUse.getNumber();
        paymentUse.getPrice();

        Ticket ticketUse = new Ticket(codeUse, seatUse.getLocation());

        return ticketUse;
    }

    public Payment realizePayment(String method, float pay) {//received payment method

        float subtotal = 600.00F;
        float vat = subtotal * 0.12F;
        float priceUse = vat + subtotal;
        Payment paymentUse = new Payment(method, priceUse, vat, subtotal);//page

        return paymentUse;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    
}
