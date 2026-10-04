package com.amani.elms.repository;


import com.amani.elms.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface  EmployeeRepository extends JpaRepository<Employee, UUID> {

}

