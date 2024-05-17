package com.example.projectmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectViewController {

    @GetMapping("/")
    public String viewProjects() {
        return "index";
    }
}
