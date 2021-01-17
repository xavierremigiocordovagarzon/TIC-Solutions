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
public class Airline {

    private String name;
    private Aircraft aircraft;
    private Employee employee;
    private String direction;
    private int telephone;

    public Airline(String name, Employee employee, String direction, int telephone) {
        this.name = name;
        this.aircraft = aircraft;
        this.employee = employee;
        this.direction = direction;
        this.telephone = telephone;

    }

    public Airline getAirplaneData(String name, String direction, int telephone) {
        name = "AEROLINEAMAX";
        telephone = 2955789;
        direction = "AEROPUERTO INTERNACIONAL DE QUITO\n TABABELO S/N VIA, QUITO 170907";
        Airline airlineUse = new Airline(name, employee, direction, telephone);

        return airlineUse;
    }

    @Override
    public String toString() {
        return  name + ";" + aircraft + ";" + employee + ";" + direction + ";" + telephone;
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
     * @return the aircraft
     */
    public Aircraft getAircraft() {
        return aircraft;
    }

    /**
     * @param aircraft the aircraft to set
     */
    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * @return the telephone
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

}
