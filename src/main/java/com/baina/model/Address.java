package com.baina.model;

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
public class Address {
	
	private String type;
	
	private String street;
	
	private String city;
	
	private String zipcode;
	
	private String country;
	
	

}
