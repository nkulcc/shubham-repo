package com.springannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springannotation.component.College;
import com.springannotation.component.CollegeBean;
import com.springannotation.service.MathService;

@SpringBootApplication

public class SpringannotationApplication {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		College college=context.getBean(College.class);
		System.out.println("The college object is created-->"+college);
		college.test();
		
//		ApplicationContext contextBean= new AnnotationConfigApplicationContext(ApplicationConfigBean.class);
//		CollegeBean collegeBean=contextBean.getBean("collegeBean",CollegeBean.class);
//		System.out.println("The college object is created-->"+collegeBean);
//		collegeBean.test();
		
		//Service
		MathService ms = context.getBean(MathService.class);

		int add = ms.add(1, 2);
		System.out.println("Addition of 1 and 2 = " + add);

		int subtract = ms.subtract(2, 1);
		System.out.println("Subtraction of 2 and 1 = " + subtract);
	}

}
