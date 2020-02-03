package com.baina.router;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baina.model.Address;
import com.baina.model.Education;
import com.baina.model.Employee;

@Component
public class SetEmployeeInfo {
	
	
	public Employee emp=new Employee();
	
	@Handler
	public void process(Exchange exchange) {
		
		int i=(int) exchange.getProperty("id");
		
		String name=(String) exchange.getProperty("name");
		
		List<Education> education=exchange.getProperty("emp_education_details", List.class);
		
		List<Address> address=exchange.getProperty("employee_address_details", List.class);
		
		System.out.println(i);
		
		System.out.println(name);
		
		System.out.println(education);
		
		System.out.println(address);
		
		emp.setId(i);
		emp.setName(name);
		emp.setEducationDetails(education);
		emp.setAddressDetails(address);
		
		exchange.getIn().setBody(emp);
		
	}

}
