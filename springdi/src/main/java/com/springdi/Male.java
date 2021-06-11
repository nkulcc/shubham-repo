package com.springdi;

import org.springframework.stereotype.Component;

@Component
public class Male implements Gender {

	@Override
	public String getGender() {
		return "I am male";
	}

}
