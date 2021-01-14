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
public class Airline {

    private String name;
    private ArrayList<Aircraft> aircraft;
    private ArrayList<Employee> employee;
    private String direction;
    private int telephone;
   

    public Aircraft getAirplaneData(Aircraft aircraft) {
        ArrayList<Aircraft> aircraftUse = new ArrayList<>();
        aircraftUse.addAll(Arrays.asList(aircraft));
        return aircraft;
    }
    
    public Employee getEmployeeData(Employee employee) {
        ArrayList<Employee> employeeUse = new ArrayList<>();
        employeeUse.addAll(Arrays.asList(employee));
        return employee;
    }

    public Airline(ArrayList<Aircraft> aircraft, ArrayList<Employee> employee) {
        this.aircraft = aircraft;
        this.employee = employee;
    }
    
    
    public Airline() {
        this.name = "AEROILENEAMAX";
        this.direction = "AEROPUERTO INTERNACIONAL\nDE QUITOTABABELO S/N VIA, QUITO\n170907";
        this.telephone = 2955789;
    }
    

    @Override
    public String toString() {
        return "Airline{" + "name=" + getName() + ", aircraft=" + getAircraft() + ", employee=" + getEmployee() + ", direction=" + getDirection() + ", telephone=" + getTelephone() + '}';
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
    public ArrayList<Aircraft> getAircraft() {
        return aircraft;
    }

    /**
     * @param aircraft the aircraft to set
     */
    public void setAircraft(ArrayList<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }

    /**
     * @return the employee
     */
    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(ArrayList<Employee> employee) {
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
