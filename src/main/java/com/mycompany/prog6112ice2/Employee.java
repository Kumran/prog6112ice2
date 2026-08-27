/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.prog6112ice2;

/**
 *
 * @author maist
 */
public abstract class Employee {
 
    // ----- Attributes -----
    protected String name;
    protected String employeeId;
    protected double baseSalary;
 
    /**
     * Constructor for Employee.
     * @param name        the employee's name
     * @param employeeId  the employee's unique ID
     * @param baseSalary  the employee's base salary
     */
    public Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }
 
    // ----- Getters -----
    public String getName() {
        return name;
    }
 
    public String getEmployeeId() {
        return employeeId;
    }
 
    public double getBaseSalary() {
        return baseSalary;
    }
 
    /**
     * Abstract method to be implemented by subclasses.
     * Each type of employee calculates commission differently.
     * @return the calculated commission amount.
     */
    public abstract double calculateCommission();
}
