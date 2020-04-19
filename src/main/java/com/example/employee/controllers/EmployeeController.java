package com.example.employee.controllers;

import java.util.List;

import com.example.employee.Models.Employee;
import com.example.employee.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Employee Controller
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    /**
     * Função para listar todos os funcionários
     */
    @GetMapping("/employee")
    public ModelAndView getAllEmployees(){
        ModelAndView mv = new ModelAndView("employeeView");

        List<Employee> listEmployees = service.getAllEmployees();

        mv.addObject("employees", listEmployees);
        return mv;
    }

    /**
     * Função para cadastrar um funcionário
     */
    @PostMapping("/employee")
    public ModelAndView createEmployee(@ModelAttribute Employee employee){
        ModelAndView mv = new ModelAndView("employeeView");

        System.out.println(employee);
        boolean createSuccess = service.createEmployee(employee.getName(), employee.getLastName(), employee.getSector(), employee.getSalary());
        
        // usar html para checagem de erro ao criar funcionário
        mv.addObject("wasCreated", createSuccess);

        List<Employee> listEmployees = service.getAllEmployees();

        mv.addObject("employees", listEmployees);
        return mv;
    }








}