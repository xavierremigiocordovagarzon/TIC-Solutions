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
public class Customer {
    private String name;
    private Trading trading;
    private String id;
    private String thelephone;
    private String email;
    private Reservation reservation;

    public Customer(String name, Trading trading, String id, String thelephone, String email, Reservation reservation) {
        this.name = name;
        this.trading = trading;
        this.id = id;
        this.thelephone = thelephone;
        this.email = email;
        this.reservation = reservation;
    }


    @Override
    public String toString() {
        return getId() + "," + name + "," + trading + "," + thelephone + "," + email + "," + reservation ;
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
    public Trading getTrading() {
        return trading;
    }

    /**
     * @param trading the trading to set
     */
    public void setTrading(Trading trading) {
        this.trading = trading;
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
     * @return the reservation
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * @param reservation the reservation to set
     */
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
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

}
