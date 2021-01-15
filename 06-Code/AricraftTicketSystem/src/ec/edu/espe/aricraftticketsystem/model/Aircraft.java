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
class Aircraft {

    private String aricraftnumber;
    private Seat seat;
    private boolean availability;
    private int numberofseat;

    public Aircraft(String aricraftnumber, Seat seat, boolean availability, int numberofseat) {
        this.aricraftnumber = aricraftnumber;
        this.seat = seat;
        this.availability = availability;
        this.numberofseat = numberofseat;
    }

    @Override
    public String toString() {
        return "Aircraft{" + "aricraftnumber=" + aricraftnumber + ", seat=" + seat + ", availability=" + availability + ", numberofseat=" + numberofseat + '}';
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
