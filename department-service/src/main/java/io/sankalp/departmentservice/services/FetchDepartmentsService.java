package io.sankalp.departmentservice.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.sankalp.departmentservice.dtos.DepartmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FetchDepartmentsService {

    @Autowired
    private ObjectMapper objectMapper;

    public List<DepartmentDTO> getDepartments () throws IOException {
        Resource resource = new ClassPathResource( "departments.json" );
        FileInputStream file = new FileInputStream( resource.getFile() );
        return Arrays.asList ( objectMapper.readValue ( file, DepartmentDTO[].class ) );
    }
}
