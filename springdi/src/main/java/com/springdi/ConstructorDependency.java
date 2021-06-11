package com.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorDependency {

	Female female;
	ConstructorDependency(Female female){
		this.female=female;
	}
	
	public void run() {
		System.out.println(this.female.getGender());
	} 
}
