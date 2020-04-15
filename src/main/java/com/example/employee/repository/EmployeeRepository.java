package com.example.employee.repository;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.employee.Models.Employee;

import org.springframework.stereotype.Repository;

/**
 * Employee Repository
 */
@Repository
public class EmployeeRepository {

    public HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();

    /**
     * Função para criar um funcionário
     */
    public void createEmployee(String name, String sector, String lastName, Double salary){
        hm.put(hm.size()+1, new Employee(hm.size()+1, name, sector, lastName, salary));
    }   

    /**
     * Função para selecionar todos os funcionários
     */
    public ArrayList<Employee> getAllEmployees(){
        return new ArrayList<Employee>(hm.values());
    }
}