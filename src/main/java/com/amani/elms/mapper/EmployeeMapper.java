package com.amani.elms.mapper;


import com.amani.elms.dto.EmployeeDTO;
import com.amani.elms.entity.Employee;
import org.springframework.stereotype.Component;


@Component
public class EmployeeMapper {

    public Employee toEntity(EmployeeDTO entity){

        Employee employee = new Employee();


        employee.setEmployeeCode(entity.getEmployeeCode());

        employee.setName(entity.getName());

        employee.setEmail(entity.getEmail());

        employee.setPhone(entity.getPhone());

        employee.setDepartment(entity.getDepartment());

        employee.setJoiningDate(entity.getJoiningDate());

        employee.setDateOfBirth(entity.getDateOfBirth());

        employee.setGender(entity.getGender());

        employee.setSalary(entity.getSalary());

        return employee;
    };

public EmployeeDTO toDTO(Employee employee){

    EmployeeDTO employeeDTO = new EmployeeDTO();

    employeeDTO.setId(employee.getId());

    employeeDTO.setEmployeeCode(employee.getEmployeeCode());

    employeeDTO.setName(employee.getName());

    employeeDTO.setEmail(employee.getEmail());

    employeeDTO.setPhone(employee.getPhone());

    employeeDTO.setDepartment(employee.getDepartment());

    employeeDTO.setJoiningDate(employee.getJoiningDate());

    employeeDTO.setDateOfBirth(employee.getDateOfBirth());

    employeeDTO.setGender(employee.getGender());

    employeeDTO.setSalary(employee.getSalary());


   return employeeDTO;

};

}


