package com.springannotation.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class College {

	@Value("SHUATS")
	private String collegeName;
	@Autowired
	private PrincipalComponent principalComponent;
	
	@Autowired 
	@Qualifier("englishteacher")
	private Teacher teacher;
	
	public void test() {
		principalComponent.principalInfo();
		teacher.teach();
		System.out.println("My college name is:"+collegeName);
	
		System.out.println("test() is called for college class");
	}
}
