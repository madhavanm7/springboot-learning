package com.springboot.app.springbootbackend.service.impl;

import com.springboot.app.springbootbackend.model.Employee;
import com.springboot.app.springbootbackend.repository.EmployeeRepository;
import com.springboot.app.springbootbackend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceimpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    public EmployeeServiceimpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
