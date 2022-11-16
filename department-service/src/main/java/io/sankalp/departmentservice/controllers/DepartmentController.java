package io.sankalp.departmentservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @GetMapping("/")
    public String welcome () {
        return "Hey! We are going to provide all the details about the departments in the school.";
    }
}
