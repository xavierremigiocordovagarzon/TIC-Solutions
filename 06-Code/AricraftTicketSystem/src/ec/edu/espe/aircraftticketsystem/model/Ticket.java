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
public class Ticket {
    private int code;
    private int seatnumber;
    private float price;
    private Customer customer_data;
    private String setlocation;

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the seatnumber
     */
    public int getSeatnumber() {
        return seatnumber;
    }

    /**
     * @param seatnumber the seatnumber to set
     */
    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
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
     * @return the customer_data
     */
    public Customer getCustomer_data() {
        return customer_data;
    }

    /**
     * @param customer_data the customer_data to set
     */
    public void setCustomer_data(Customer customer_data) {
        this.customer_data = customer_data;
    }

    /**
     * @return the setlocation
     */
    public String getSetlocation() {
        return setlocation;
    }

    /**
     * @param setlocation the setlocation to set
     */
    public void setSetlocation(String setlocation) {
        this.setlocation = setlocation;
    }
}
