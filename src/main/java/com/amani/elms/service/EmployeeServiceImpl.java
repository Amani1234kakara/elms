package com.amani.elms.service;

import com.amani.elms.dto.EmployeeDTO;
import com.amani.elms.entity.Employee;
import com.amani.elms.mapper.EmployeeMapper;
import com.amani.elms.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

   private EmployeeRepository employeeRepository;
   private EmployeeMapper employeeMapper;


   public EmployeeServiceImpl(EmployeeRepository empRepository, EmployeeMapper empMapper) {

       employeeRepository = empRepository;
       employeeMapper = empMapper;

    }


  @Override
    public EmployeeDTO CreateEmployee(EmployeeDTO employeeDTO){

      Employee employee = employeeRepository.save(
              employeeMapper.toEntity(employeeDTO)
      );

      return employeeMapper.toDTO(employee);
  }


  @Override

    public EmployeeDTO GetEmployee(UUID employeeId){

      Employee employee = employeeRepository.findById(employeeId).orElseThrow();

       return employeeMapper.toDTO(employee);
  };


   @Override

    public EmployeeDTO UpdateEmployee(UUID empId, EmployeeDTO employeeDTO){
       Employee employee = employeeRepository.findById(empId).orElseThrow();

       employee.setEmployeeCode(employeeDTO.getEmployeeCode());
       employee.setName(employeeDTO.getName());
       employee.setEmail(employeeDTO.getEmail());
       employee.setPhone(employeeDTO.getPhone());
       employee.setDepartment(employeeDTO.getDepartment());
       employee.setJoiningDate(employeeDTO.getJoiningDate());
       employee.setDateOfBirth(employeeDTO.getDateOfBirth());
       employee.setGender(employeeDTO.getGender());
       employee.setSalary(employeeDTO.getSalary());

       return employeeMapper.toDTO(employeeRepository.save(employee));
   }


   @Override
   public void DeleteEmployeeId(UUID employeeId){
       employeeRepository.deleteById(employeeId);


   }

   @Override
    public List<EmployeeDTO> GetAllEmployees(){
       List<Employee> employees = employeeRepository.findAll();

       return employees.stream().map(employeeMapper::toDTO).toList();

   }
}


