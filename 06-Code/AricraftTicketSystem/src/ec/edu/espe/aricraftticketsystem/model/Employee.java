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
public class Employee {
    private String name;
    private int id;
    private float salary;
    private String turn;
    private int telephone;

    public Employee(String name, int id, float salary, String turn, int telephone) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.turn = turn;
        this.telephone = telephone;
    }
    
    public Employee (){
        
         Employee employee = new Employee(name, id, salary, turn, telephone);
        //return employee;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + "; id=" + id + "; salary=" + salary + "; turn=" + turn + "; telephone=" + telephone + '}';
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
