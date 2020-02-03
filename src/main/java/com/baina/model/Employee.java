package com.baina.model;

import java.util.List;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	
	private int id;
	
	private String name;
	
	private List<Education> educationDetails;
	
	private List<Address> addressDetails;
	

}
