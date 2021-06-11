package com.springdi;

import org.springframework.stereotype.Component;

@Component
public class Female implements Gender {

	@Override
	public String getGender() {
		return "I am female";
	}

}
