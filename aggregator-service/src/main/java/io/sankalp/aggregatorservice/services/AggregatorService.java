package io.sankalp.aggregatorservice.services;

import io.sankalp.aggregatorservice.dtos.DepartmentDTO;
import io.sankalp.aggregatorservice.dtos.ResponseDTO;
import io.sankalp.aggregatorservice.dtos.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AggregatorService {

    @Autowired
    RestTemplate restTemplate;

    public ResponseDTO getStudentDetailsWithDepartmentDetailsByStudentName ( String studentName ) {

        StudentDTO student = restTemplate.getForObject( "http://localhost:8080/getStudentByName?studentName=" + studentName, StudentDTO.class );
        DepartmentDTO department = restTemplate.getForObject( "http://localhost:7777/getDepartmentByName?name=" + (student != null ? student.getDepartmentName() : null), DepartmentDTO.class );

        return new ResponseDTO().prepareResponse( student, department );
    }
}
