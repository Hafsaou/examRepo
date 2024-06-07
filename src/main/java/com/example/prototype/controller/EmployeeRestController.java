package com.example.prototype.controller;


import com.example.prototype.model.Employee;
import com.example.prototype.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeRestController {

 

@Autowired
private EmployeeService employeeService;

@GetMapping("/all")
public @ResponseBody List<Employee> getAllEmployees() {
    return employeeService.findAllEmployees();
}
    
}
