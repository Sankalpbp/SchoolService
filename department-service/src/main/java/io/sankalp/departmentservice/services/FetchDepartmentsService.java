package io.sankalp.departmentservice.services;

import io.sankalp.departmentservice.dtos.DepartmentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FetchDepartmentsService {

    public List<DepartmentDTO> getDepartments () {
        return new ArrayList<>();
    }
}
