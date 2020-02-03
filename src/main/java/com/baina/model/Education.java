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
public class Education {
	
	private String standard;
	
	private String eduInsName;
	
	private int yearOfPassing;

}
