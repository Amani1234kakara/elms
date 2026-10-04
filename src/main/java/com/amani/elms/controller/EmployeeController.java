package com.amani.elms.controller;


import com.amani.elms.dto.EmployeeDTO;
import com.amani.elms.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController

@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

public EmployeeController (EmployeeService employeeService){
    this.employeeService = employeeService;


}

    @PostMapping
    public EmployeeDTO CreateEmployee(@RequestBody EmployeeDTO  emplyeeDTO){

        return employeeService.CreateEmployee(emplyeeDTO);
    }


@GetMapping("/{employeeId}")
    public EmployeeDTO GetEmployee(@PathVariable UUID employeeId){

    return employeeService.GetEmployee(employeeId);
}

@PutMapping("/{employeeId}")
    public EmployeeDTO UpdateEmployee(@PathVariable UUID employeeId,
                                      @RequestBody EmployeeDTO  emplyeeDTO){

    return employeeService.UpdateEmployee(employeeId,emplyeeDTO);
}


@DeleteMapping("/{employeeId}")
    public ResponseEntity<String> DeleteEmployee(@PathVariable UUID employeeId){

    employeeService.DeleteEmployeeId(employeeId);

    return ResponseEntity.ok("Employee deleted successfully");
}


@GetMapping
    public List<EmployeeDTO> GetAllEmployees(){

    return employeeService.GetAllEmployees();


}


}
