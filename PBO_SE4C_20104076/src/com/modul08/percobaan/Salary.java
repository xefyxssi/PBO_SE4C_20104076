/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul08.percobaan;

/**
 *
 * @author Windows 10
 */
public class Salary extends Employee {

    private double annualSalary;

    public Salary(String name, String address, int number, int salary) {
        super(name, address, number);
        this.annualSalary = salary;
    }

    public void checkMail() {
        System.out.println("Checking mails for " + getName());
        System.out.println("With annual salary of $" + annualSalary);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double newSalary) {
        if (newSalary >= 0) {
            this.annualSalary = newSalary;
        } else {
            System.out.println("Error: Negative salary is not allowed!");
        }
    }

    public double computerSalary() {
        System.out.println("Calculating salary for " + getName() + "...");
        return annualSalary / 52;
    }
}
