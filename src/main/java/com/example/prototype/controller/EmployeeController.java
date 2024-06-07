package com.example.prototype.controller;

import com.example.prototype.model.Employee;
import com.example.prototype.model.Project;
import com.example.prototype.service.EmployeeService;
import com.example.prototype.service.ProjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;

@PostMapping("/saveEmployee")
public ModelAndView saveEmployee(@Valid @ModelAttribute("employee") Employee employee ) {
    employeeService.saveEmployee(employee);
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("employee_list");
    return modelAndView;


}

@GetMapping("/affectation")
public ModelAndView affectation() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("affectation");
    List<Project> projects = projectService.findAllProjects();

    modelAndView.addObject("projects",projectService);
    return modelAndView;
}




}
