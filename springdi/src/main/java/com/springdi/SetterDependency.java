package com.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterDependency {
	
	
	private Male male;
	
	@Autowired
	public void setMale(Male male) {
		System.out.println("setMale");
		this.male=male;
	}
	public void run() {
		System.out.println(this.male.getGender());
	}
}
