package com.springboot.app.springbootbackend.controller;

import com.springboot.app.springbootbackend.dto.SalaryRequestDTO;
import com.springboot.app.springbootbackend.model.EmpSalary;
import com.springboot.app.springbootbackend.service.EmpSalaryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees/salary")
public class EmpSalaryController {

    private final EmpSalaryService empSalaryService;

    public EmpSalaryController(EmpSalaryService empSalaryService) {
        super();
        this.empSalaryService = empSalaryService;
    }

    @PostMapping()
    public ResponseEntity<EmpSalary> creditSalary(
            @RequestBody SalaryRequestDTO dto) {

        return new ResponseEntity<>(
                empSalaryService.creditSalary(dto),
                HttpStatus.CREATED);
    }
}