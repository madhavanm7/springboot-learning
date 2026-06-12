package com.springboot.app.springbootbackend.repository;

import com.springboot.app.springbootbackend.model.EmployeeSalary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpSalaryRepository extends JpaRepository<EmployeeSalary, Long> {

}
