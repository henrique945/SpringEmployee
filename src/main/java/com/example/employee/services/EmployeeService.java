package com.example.employee.services;

import java.util.ArrayList;

import com.example.employee.Models.Employee;
import com.example.employee.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Employee service
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Criar um funcionário
     * Retorna se foi um sucesso ou não
     */
    public boolean createEmployee(String name, String sector, boolean isIntern, double salary){
        if(name.isEmpty() || sector.isEmpty()){
            return false;
        }
        employeeRepository.createEmployee(name, sector, isIntern, salary);
        return true;
    }

    /**
     * Busca e retorna todos os funcionários
     */
    public ArrayList<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }
}