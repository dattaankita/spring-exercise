package com.luv2code.springboot.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
