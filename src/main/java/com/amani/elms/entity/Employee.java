package com.amani.elms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;


@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String employeeCode;

    private String name;

    private String email;

    private String phone;

    private String department;

    private LocalDate joiningDate;

    private LocalDate dateOfBirth;

    private String gender;

    @ManyToOne
    private Employee reporter;

    private Boolean active;

    private BigDecimal salary;




}
