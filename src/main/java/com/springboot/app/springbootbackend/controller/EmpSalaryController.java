package com.springboot.app.springbootbackend.controller;

import com.springboot.app.springbootbackend.model.EmpSalary;
import org.springframework.web.bind.annotation.*;

//@RestController Tells Spring:
//"This class contains REST APIs."
@RestController

@RequestMapping("/api/employees/salary")

public class EmpSalaryController {
    private EmpSalary empSalary;



}
