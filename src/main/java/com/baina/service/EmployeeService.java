package com.baina.service;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baina.model.Employee;
import com.baina.router.SetEmployeeInfo;

@Service
public class EmployeeService {


	
	@Produce("direct:start")
	ProducerTemplate producerTemplate;

	public Employee getEmployee() {
		//here we are giving empty object to the router builder and ofter processing the out put wil be the Employee type thats why we are giving that
		return producerTemplate.requestBody(new Employee(), Employee.class);		
	}
	
}
