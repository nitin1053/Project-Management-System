package com.example.projectmanagement.repositories;

import com.example.projectmanagement.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
