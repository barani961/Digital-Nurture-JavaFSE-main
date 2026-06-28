package com.example.spring_data_jpa_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring_data_jpa_demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}