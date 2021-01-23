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
    private String setlocation;

    public Ticket(int code, String setlocation) {
        this.code = code;
        this.setlocation = setlocation;
    }

    @Override
    public String toString() {
        return code  + ";" + setlocation;
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
