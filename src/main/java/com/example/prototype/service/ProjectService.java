package com.example.prototype.service;

import com.example.prototype.model.Project;
import com.example.prototype.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
@Autowired
private ProjectRepository projectRepository;

public Project createProject(Project project) {
    return projectRepository.save(project);
}

public Project saveProject(Project project) {
    return projectRepository.save(project);
}

public List<Project> findAllProjects() {
    return projectRepository.findAll();
}

    
}
