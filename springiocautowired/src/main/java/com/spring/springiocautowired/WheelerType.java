package com.spring.springiocautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WheelerType {
	 @Autowired
	 public FourWheeler fourWheeler;
	 
	 public String getType() {
	        return fourWheeler.getVehicleType();
	    }
}
