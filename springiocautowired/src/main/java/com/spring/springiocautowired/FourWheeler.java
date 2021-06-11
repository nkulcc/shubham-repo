package com.spring.springiocautowired;

import org.springframework.stereotype.Component;

@Component
public class FourWheeler implements Vehicle {

	@Override
	public String getVehicleType() {
		return "I am four wheeler";
	}

}
