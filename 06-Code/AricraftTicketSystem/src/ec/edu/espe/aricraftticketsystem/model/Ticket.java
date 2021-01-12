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
public class Ticket {
    private int code;
    private Seat seat;
    private float price;
    private String setlocation;

    public Ticket(int code, Seat seat, float price, String setlocation) {
        this.code = code;
        this.seat = seat;
        this.price = price;
        this.setlocation = setlocation;
    }

    @Override
    public String toString() {
        return code + ";" + seat + ";" + price + ";" + setlocation;
    }



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

    /**
     * @return the seat
     */
    public Seat getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
