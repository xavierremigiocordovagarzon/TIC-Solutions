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


    public Ticket(int code, Seat seat, float price) {
        this.code = code;
        this.seat = seat;
        this.price = price;
      
    }
    public Seat datosdeSeat(Seat seat){
        
        return seat;
    }

    @Override
    public String toString() {
        return code + ";" + seat + ";" + price;
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
