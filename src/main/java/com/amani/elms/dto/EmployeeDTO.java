package com.amani.elms.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;


@Getter
@Setter
public class EmployeeDTO {

    private UUID id;

    private String employeeCode;

    private String name;

    private String email;

    private String phone;

    private String department;

    private LocalDate joiningDate;

    private LocalDate dateOfBirth;

    private String gender;

    private UUID reporterId;

    private BigDecimal salary;

}
