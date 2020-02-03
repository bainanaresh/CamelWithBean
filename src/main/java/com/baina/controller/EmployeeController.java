package com.baina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baina.model.Employee;
import com.baina.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService service;
	
	@GetMapping("/employee")
	public Employee getEmployee() {
		return service.getEmployee();
	}
	
}
