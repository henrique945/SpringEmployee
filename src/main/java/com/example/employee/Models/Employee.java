package com.example.employee.Models;

/**
 * Employee
 */
public class Employee {

    private int id;
    private String name;
    private String lastName;
    private String sector;
    private Double salary;

    public Employee(){}

    public Employee(int id, String name, String sector, String lastName, Double salary){
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.lastName = lastName;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", lastName=" + lastName + ", name=" + name + ", salary=" + salary + ", sector="
                + sector + "]";
    }
}