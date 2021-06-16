package com.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springannotation.component.CollegeBean;
import com.springannotation.component.MathTeacher;
import com.springannotation.component.Principal;
import com.springannotation.component.Teacher;

@Configuration
public class ApplicationConfigBean {

	@Bean
	public Teacher mathTeacherBean() { //collegeBean is bean id
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBean() { //collegeBean is bean id
		return new Principal();
	}
	@Bean
	public CollegeBean collegeBean() { //collegeBean is bean id
		//return new CollegeBean(principalBean());  //Using constructor
		CollegeBean collegeBean=new CollegeBean();
		collegeBean.setPrincipal(principalBean());
		collegeBean.setTeacher(mathTeacherBean());;
		return collegeBean; //Using setter method
	}
}
