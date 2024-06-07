package com.example.prototype.service;

import com.example.prototype.model.Employee;
import com.example.prototype.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

@Autowired
private EmployeeRepository employeeRepository;

public List<Employee> findAllEmployees() {
    return employeeRepository.findAll();
}


public void deleteEmployee(Long id) {
    employeeRepository.deleteById(id);
}

public Employee saveEmployee(Employee employee) {
    return employeeRepository.save(employee);
}




}
