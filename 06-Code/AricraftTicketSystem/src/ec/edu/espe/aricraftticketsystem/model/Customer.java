/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.aricraftticketsystem.model;

import java.util.ArrayList;

/**
 *
 * @author George
 */
public class Customer {
    private String name;
    private ArrayList<Trading> trading;
    private String id;
    private String thelephone;
    private String email;
    private ArrayList<Reservation> reservation;

    public Customer(String name, ArrayList<Trading> trading, String id, String thelephone, String email, ArrayList<Reservation> reservation) {
        this.name = name;
        this.trading = trading;
        this.id = id;
        this.thelephone = thelephone;
        this.email = email;
        this.reservation = reservation;
    }



    @Override
    public String toString() {
        return getId() + ";" + name + ";" + trading.toString() + ";" + getThelephone() + ";" + email + ";" + reservation.toString() ;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the trading
     */


    /**
     * @param trading the trading to set
     */
    public void setTrading(Trading trading) {
        this.setTrading(trading);
    }


    /**
     * @param thelephone the thelephone to set
     */
    public void setThelephone(int thelephone) {
        this.setThelephone(thelephone);
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param reservation the reservation to set
     */
    public void setReservation(Reservation reservation) {
        this.setReservation(reservation);
    }

    /**
     * @param thelephone the thelephone to set
     */
    public void setThelephone(String thelephone) {
        this.thelephone = thelephone;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param trading the trading to set
     */
    public void setTrading(ArrayList<Trading> trading) {
        this.trading = trading;
    }

    /**
     * @return the thelephone
     */
    public String getThelephone() {
        return thelephone;
    }

    /**
     * @return the trading
     */
    public ArrayList<Trading> getTrading() {
        return trading;
    }

    /**
     * @param reservation the reservation to set
     */
    public void setReservation(ArrayList<Reservation> reservation) {
        this.reservation = reservation;
    }

    private Object getReservation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
