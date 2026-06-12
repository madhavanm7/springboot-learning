package com.springboot.app.springbootbackend.service;

import com.springboot.app.springbootbackend.model.Employee;
import com.springboot.app.springbootbackend.model.EmpSalary;

public interface EmpSalaryService {
    EmpSalary creditSalary(Employee emp);
}
