package com.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		SetterDependency setterDependency = context.getBean(SetterDependency.class);
		setterDependency.run();
        
        ConstructorDependency constructorDependency = context.getBean(ConstructorDependency.class);
        constructorDependency.run();
        context.close();
	}

}
