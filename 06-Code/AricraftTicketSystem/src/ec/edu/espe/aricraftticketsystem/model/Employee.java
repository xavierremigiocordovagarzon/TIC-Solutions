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
public class Employee {

    private String name;
    private String  id;
    private float salary;
    private String turn;
    private String telephone;

    public Employee(String name, String id, float salary, String turn, String telephone) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.turn = turn;
        this.telephone = telephone;
    }
    
    public Employee identifyTipeOfEmployee() {

        Employee employeeUse = new Employee("ANDRES BENAVIDEZ", "2300608441", 1000.00F, "NOCTURNO", "0981297292");

        return employeeUse;
    }

    @Override
    public String toString() {
        return getName() + ";" + getId() + ";" + getSalary() + ";" + getTurn() + ";" + getTelephone();
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
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the turn
     */
    public String getTurn() {
        return turn;
    }

    /**
     * @param turn the turn to set
     */
    public void setTurn(String turn) {
        this.turn = turn;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    
}
