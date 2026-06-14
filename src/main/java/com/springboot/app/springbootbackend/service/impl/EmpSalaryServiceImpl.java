package com.springboot.app.springbootbackend.service.impl;

import com.springboot.app.springbootbackend.dto.SalaryRequestDTO;
import com.springboot.app.springbootbackend.exception.ResourceNotFoundException;
import com.springboot.app.springbootbackend.model.EmpSalary;
import com.springboot.app.springbootbackend.model.Employee;
import com.springboot.app.springbootbackend.repository.EmpSalaryRepository;
import com.springboot.app.springbootbackend.repository.EmployeeRepository;
import com.springboot.app.springbootbackend.service.EmpSalaryService;
import org.springframework.stereotype.Service;

@Service
public class EmpSalaryServiceImpl implements EmpSalaryService {

    private final EmpSalaryRepository empSalaryRepository;
    private final EmployeeRepository employeeRepository;

    public EmpSalaryServiceImpl(
            EmpSalaryRepository empSalaryRepository,
            EmployeeRepository employeeRepository) {

        this.empSalaryRepository = empSalaryRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmpSalary creditSalary(SalaryRequestDTO dto) {

        Employee employee = employeeRepository.findById(dto.getEmployeeId())
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Employee",
                                "Id",
                                dto.getEmployeeId()
                        ));

        EmpSalary empSalary = new EmpSalary();

        empSalary.setSalary(dto.getSalary());
        empSalary.setEmployee(employee);

        return empSalaryRepository.save(empSalary);
    }
}