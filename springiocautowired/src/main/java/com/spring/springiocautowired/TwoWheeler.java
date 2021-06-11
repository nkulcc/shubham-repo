package com.spring.springiocautowired;

import org.springframework.stereotype.Component;

@Component
public class TwoWheeler implements Vehicle {

	@Override
	public String getVehicleType() {
		return "I am two wheeler";
	}

}
