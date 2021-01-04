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
public class Balance {
    private int numberofcustomers;
    private int numberofflights;
    private int cancelations;
    private int reservations;
    private float gain;

    /**
     * @return the numberofcustomers
     */
    public int getNumberofcustomers() {
        return numberofcustomers;
    }

    /**
     * @param numberofcustomers the numberofcustomers to set
     */
    public void setNumberofcustomers(int numberofcustomers) {
        this.numberofcustomers = numberofcustomers;
    }

    /**
     * @return the numberofflights
     */
    public int getNumberofflights() {
        return numberofflights;
    }

    /**
     * @param numberofflights the numberofflights to set
     */
    public void setNumberofflights(int numberofflights) {
        this.numberofflights = numberofflights;
    }

    /**
     * @return the cancelations
     */
    public int getCancelations() {
        return cancelations;
    }

    /**
     * @param cancelations the cancelations to set
     */
    public void setCancelations(int cancelations) {
        this.cancelations = cancelations;
    }

    /**
     * @return the reservations
     */
    public int getReservations() {
        return reservations;
    }

    /**
     * @param reservations the reservations to set
     */
    public void setReservations(int reservations) {
        this.reservations = reservations;
    }

    /**
     * @return the gain
     */
    public float getGain() {
        return gain;
    }

    /**
     * @param gain the gain to set
     */
    public void setGain(float gain) {
        this.gain = gain;
    }
}
