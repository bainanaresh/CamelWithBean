package com.baina.router;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

import com.baina.model.Address;
import com.baina.model.Education;

@Component
public class SetAddressInfo {

	@Handler
	public void process(Exchange exchange) {

		List<Address> address = new ArrayList<>();

		Address presentAddress = new Address("present", "bharathamatha street", "v v raopet", "505331", "india");

		Address permanentAddress = new Address("permanent", "bharathamatha street", "v v raopet", "505331", "india");

		address.add(presentAddress);
		address.add(permanentAddress);

		exchange.setProperty("employee_address_details", address);

	}

}
