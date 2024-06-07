package com.example.prototype.controller;

import com.example.prototype.model.Project;
import com.example.prototype.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

@GetMapping("/projects")
public List<Project> getProjectNames() {
    return  projectService.findAllProjects();
}

    
}
