package com.baina.router;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.baina.model.Employee;
@Component
public class SetEmployeeBasicInfo {

	@Handler
	public void process(Exchange exchange) {
		
//		Employee e = exchange.getIn().getBody(Employee.class);
		System.out.println("set emp basic info*******");
		exchange.setProperty("id",1);
		exchange.setProperty("name","Naresh");
		
	}
}
