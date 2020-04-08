package com.example.employee.Models;

/**
 * Employee
 */
public class Employee {

    private int id;
    private String name;
    private String sector;
    private boolean isIntern;
    private double salary;

    public Employee(){}

    public Employee(int id, String name, String sector, boolean isIntern, double salary){
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.isIntern = isIntern;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean isIntern() {
        return isIntern;
    }

    public void setIntern(boolean isIntern) {
        this.isIntern = isIntern;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", isIntern=" + isIntern + ", name=" + name + ", salary=" + salary + ", sector="
                + sector + "]";
    }
}