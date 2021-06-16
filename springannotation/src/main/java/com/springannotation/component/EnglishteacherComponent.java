package com.springannotation.component;

import org.springframework.stereotype.Component;

@Component("englishteacher")
public class EnglishteacherComponent implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am your english teacher");
		
	}

}
