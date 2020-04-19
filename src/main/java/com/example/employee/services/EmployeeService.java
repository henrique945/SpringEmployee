package com.example.employee.services;

import java.util.List;

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
    public boolean createEmployee(String name, String lastName, String sector, Double salary){
        if(name.isEmpty() || lastName.isEmpty() || sector.isEmpty() || salary == 0){
            return false;
        }

        List<Employee> auxEmployeeList = employeeRepository.findAll();

        Employee auxEmployee = new Employee( auxEmployeeList.size() + 1, name, sector, lastName, salary);
        employeeRepository.save(auxEmployee);
        
        return true;
    }

    /**
     * Busca e retorna todos os funcionários
     */
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}