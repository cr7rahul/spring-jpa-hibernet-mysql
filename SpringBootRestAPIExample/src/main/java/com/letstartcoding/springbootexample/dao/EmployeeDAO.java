package com.letstartcoding.springbootexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letstartcoding.springbootexample.model.Employee;
import com.letstartcoding.springbootexample.repository.EmployeeRepository;
 

@Service
public class EmployeeDAO {
	@Autowired
	EmployeeRepository employeeRepository;

	/* Post info */
	public Employee postEmployeeInfo(Employee emp) {
		return employeeRepository.save(emp);
	}

	/* Retrieve List */
	public List<Employee> retrieveList() {
		return employeeRepository.findAll();
	}

	/* Retrieve Details */
	public Employee retrieveDetails(Long empID) {
		return employeeRepository.findOne(empID);
		 
	}

	/* Delete info */
	public void purgeEmployeeInfo(Employee emp) {
		employeeRepository.delete(emp);
	}

	/* Update info */

}
