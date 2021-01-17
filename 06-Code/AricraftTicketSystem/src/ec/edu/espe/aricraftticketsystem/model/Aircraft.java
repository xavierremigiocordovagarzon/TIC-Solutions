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
public class Aircraft {

    private String aricraftnumber;
    private Seat seat;
    private boolean availability;
    private int numberofseat;

    public Aircraft() {
        this.aricraftnumber = aricraftnumber;
        this.seat = seat;
        this.availability = availability;
        this.numberofseat = numberofseat;
    }

    public String identifyLocationSeat(int opcion) {

        String Clocation;
        Seat seatUse = new Seat(aricraftnumber, opcion);
        if (opcion == 1) {
            seatUse.setLocation("Venatana");
            Clocation = "Venatana";
        } else {
            seatUse.setLocation("Pasillo");
            Clocation = "Pasillo";
        }

        return Clocation;
    }

    public Seat identifyNumberSeat(int op) {

        Seat seatUse = new Seat(aricraftnumber, op);
        seatUse.setNumber(op);
        return seatUse;
    }

    @Override
    public String toString() {
        return aricraftnumber + ";" + seat + ";" + availability + ";" + numberofseat;
    }

    /**
     * @return the aricraftnumber
     */
    public String getAricraftnumber() {
        return aricraftnumber;
    }

    /**
     * @param aricraftnumber the aricraftnumber to set
     */
    public void setAricraftnumber(String aricraftnumber) {
        this.aricraftnumber = aricraftnumber;
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

    /**
     * @return the availability
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    /**
     * @return the numberofseat
     */
    public int getNumberofseat() {
        return numberofseat;
    }

    /**
     * @param numberofseat the numberofseat to set
     */
    public void setNumberofseat(int numberofseat) {
        this.numberofseat = numberofseat;
    }
}
