package com.springboot.app.springbootbackend.repository;

import com.springboot.app.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
