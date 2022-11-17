package io.sankalp.departmentservice.controllers;

import io.sankalp.departmentservice.dtos.DepartmentDTO;
import io.sankalp.departmentservice.services.FetchDepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private FetchDepartmentsService departmentsService;

    @GetMapping("/")
    public String welcome () {
        return "Hey! We are going to provide all the details about the departments in the school.";
    }

    @GetMapping ("/get")
    public List<DepartmentDTO> getDepartments () throws IOException {
        return departmentsService.getDepartments();
    }

    @GetMapping ( "/getDepartmentByName" )
    public DepartmentDTO getDepartmentByName ( @RequestParam String name ) throws IOException {
        return departmentsService.getDepartmentByName ( name );
    }
}
