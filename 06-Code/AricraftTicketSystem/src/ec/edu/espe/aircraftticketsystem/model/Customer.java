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
public class Customer {
    private String name;
    private Trading trading;
    private int id;
    private int thelephone;
    private String email;
    private Reservation reservation;
    
    public void realizeTrading(Trading trading){
        
    }
    public void generateReservation(Reservation reservation){
        
    }
    public void realizeCancelation(){
        
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the thelephone
     */
    public int getThelephone() {
        return thelephone;
    }

    /**
     * @param thelephone the thelephone to set
     */
    public void setThelephone(int thelephone) {
        this.thelephone = thelephone;
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
}
