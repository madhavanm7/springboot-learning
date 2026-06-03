package com.springboot.app.springbootbackend.controller;

import com.springboot.app.springbootbackend.model.Employee;
import com.springboot.app.springbootbackend.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }
    public ResponseEntity<Employee> saveEmployee(){

    }
}
