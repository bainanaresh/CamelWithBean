package com.baina.router;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.baina.model.Education;

@Component
public class SetEmployeeEducationInfo {

	@Handler
	public void process(Exchange exchange) {
		List<Education> education=new ArrayList<>();
		Education ed1 = new Education();
		ed1.setEduInsName("ZPHS VVRAOPET");
		ed1.setStandard("9th to 10th");
		ed1.setYearOfPassing(2010);
		
		Education ed2 = new Education();
		ed1.setEduInsName("GJC RAIKAL");
		ed1.setStandard("11th to 12th");
		ed1.setYearOfPassing(2012);
		
		Education ed3 = new Education();
		ed1.setEduInsName("Sreayas Institute of Engineering And Technology");
		ed1.setStandard("9th to 10th");
		ed1.setYearOfPassing(2016);
		
		education.add(ed1);
		education.add(ed2);
		education.add(ed3);
		
		exchange.setProperty("emp_education_details", education);
		
		
	}

}
