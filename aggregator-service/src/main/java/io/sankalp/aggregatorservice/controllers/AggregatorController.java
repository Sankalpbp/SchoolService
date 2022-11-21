package io.sankalp.aggregatorservice.controllers;

import io.sankalp.aggregatorservice.dtos.ResponseDTO;
import io.sankalp.aggregatorservice.services.AggregatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatorController {

    @Autowired
    AggregatorService aggregatorService;

    @GetMapping ( "/" )
    public String welcome () {
        return "Welcome! We are the one stop solution for all the details about the school.";
    }

    @GetMapping ( "/getFullStudentDetails" )
    public ResponseDTO getStudentDetailsWithDepartmentDetailsByStudentName ( @RequestParam String studentName ) {
        return aggregatorService.getStudentDetailsWithDepartmentDetailsByStudentName ();
    }
}
