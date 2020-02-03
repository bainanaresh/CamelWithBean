package com.baina;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.baina.router.SetAddressInfo;
import com.baina.router.SetEmployeeBasicInfo;
import com.baina.router.SetEmployeeEducationInfo;
import com.baina.router.SetEmployeeInfo;

@SpringBootApplication
@Component
public class CamelWithBeanApplication extends RouteBuilder {

	public static void main(String[] args) {
		SpringApplication.run(CamelWithBeanApplication.class, args);
		 
		
	}
	

	@Override
	public void configure() throws Exception {
		System.out.println("started routing**********");
		
		from("direct:start")
		.bean(SetEmployeeBasicInfo.class)
		.bean(SetEmployeeEducationInfo.class)
		.bean(SetAddressInfo.class)
		.bean(SetEmployeeInfo.class)
		.end();

		
		System.out.println("ended routing**************");
		
	}

}
