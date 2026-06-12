package com.springboot.app.springbootbackend.controller;//package com.springboot.app.springbootbackend.controller;

import com.springboot.app.springbootbackend.model.Employee;
import com.springboot.app.springbootbackend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController Tells Spring:
//"This class contains REST APIs."
@RestController

@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public  ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
    }

    @DeleteMapping({"{id}"})
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
        employeeService.deleteEmployeeById(id);

        return new ResponseEntity<String>("Employee deleted successfully!. ", HttpStatus.OK);
    }
}
