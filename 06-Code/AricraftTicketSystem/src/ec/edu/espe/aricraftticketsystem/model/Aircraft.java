/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.aricraftticketsystem.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author George
 */
class Aircraft {

    private String aricraftnumber;
    private ArrayList<Seat> seat;
    private boolean availability;
    private int numberofseat;

    

    public Seat identifySeat(Seat seat) {
        ArrayList<Seat> seatuse = new ArrayList<>();
        seatuse.addAll(Arrays.asList(seat));
        
        return seat;
    }

    public Aircraft(String aricraftnumber, ArrayList<Seat> seat, boolean availability, int numberofseat) {
        this.aricraftnumber = aricraftnumber;
        this.seat = seat;
        this.availability = availability;
        this.numberofseat = numberofseat;
    }

    @Override
    public String toString() {
        return "Aircraft{" + "aricraftnumber=" + getAricraftnumber() + ", seat=" + getSeat() + ", availability=" + isAvailability() + ", numberofseat=" + getNumberofseat() + '}';
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
    public ArrayList<Seat> getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(ArrayList<Seat> seat) {
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
