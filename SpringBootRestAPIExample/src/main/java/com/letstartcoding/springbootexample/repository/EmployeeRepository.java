package com.letstartcoding.springbootexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letstartcoding.springbootexample.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
