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
public class Payment {
    private String paymentmethod;
    private float price;
    private float vat;
    private float subtotal;

    public Payment(String paymentmethod, float price, float vat, float subtotal) {
        this.paymentmethod = paymentmethod;
        this.price = price;
        this.vat = vat;
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return paymentmethod + "," + price + "," + vat + "," + subtotal;
    }

    /**
     * @return the paymentmethod
     */
    public String getPaymentmethod() {
        return paymentmethod;
    }

    /**
     * @param paymentmethod the paymentmethod to set
     */
    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the vat
     */
    public float getVat() {
        return vat;
    }

    /**
     * @param vat the vat to set
     */
    public void setVat(float vat) {
        this.vat = vat;
    }

    /**
     * @return the subtotal
     */
    public float getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
}
