package com.amani.elms.service;

import com.amani.elms.dto.EmployeeDTO;
import com.amani.elms.entity.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {

    EmployeeDTO CreateEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO GetEmployee(UUID employeeId);

    EmployeeDTO UpdateEmployee(UUID empId, EmployeeDTO employeeDTO);

    void DeleteEmployeeId(UUID employeeId);

    List<EmployeeDTO> GetAllEmployees();




}
