package com.springannotation.component;

import org.springframework.stereotype.Component;

@Component
public class MathteacherComponent implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am your math teacher");
		
	}

}
