package com.letstartcoding.springbootexample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.letstartcoding.springbootexample.dao.EmployeeDAO;
import com.letstartcoding.springbootexample.model.Employee;

public class EmployeeController {
	@Autowired
	EmployeeDAO employeeDAO;

	@PostMapping("/employees")
	public Employee postEmployeeInfo(@Valid @RequestBody Employee emp) {
		return employeeDAO.postEmployeeInfo(emp);
	}

	@GetMapping("/employees")
	public List<Employee> retrieveEmployeeList() {
		return employeeDAO.retrieveList();
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Employee> retrieveEmployeeDetails(@PathVariable(value = "id") Long empID) {
		Employee emp = employeeDAO.retrieveDetails(empID);
		if (emp == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
	}

	@PutMapping("/id/{id}")
	public ResponseEntity<Employee> updateEmployeeInfo(@PathVariable(value = "id") Long empID,
			@Valid @RequestBody Employee employee) {
		Employee emp = employeeDAO.retrieveDetails(empID);
		if (emp == null) {
			return ResponseEntity.notFound().build();
		}
		emp.setsFIRST_NAME(employee.getsFIRST_NAME());
		emp.setsMIDDLE_NAME(employee.getsMIDDLE_NAME());
		emp.setsLAST_NAME(employee.getsLAST_NAME());
		emp.setsDESIGNATION(employee.getsDESIGNATION());
		emp.setsEMAIL_ADDRESS(employee.getsEMAIL_ADDRESS());
		emp.setsEMPLOYEE_CODE(employee.getsEMPLOYEE_CODE());

		Employee updateInfo = employeeDAO.postEmployeeInfo(emp);
		return ResponseEntity.ok().body(updateInfo);
	}

	@DeleteMapping("/id/{id}")
	public ResponseEntity<Employee> purgeEmployeeInfo(@PathVariable(value = "id") Long empID) {
		Employee emp = employeeDAO.retrieveDetails(empID);
		if (emp == null) {
			return ResponseEntity.notFound().build();
		}
		employeeDAO.purgeEmployeeInfo(emp);
		return ResponseEntity.ok().build();
	}

}
