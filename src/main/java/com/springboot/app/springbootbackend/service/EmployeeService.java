package com.springboot.app.springbootbackend.service;

import com.springboot.app.springbootbackend.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee (Employee employee);
    List<Employee> getAllEmployees();
}
