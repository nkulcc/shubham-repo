package com.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SpringaopApplication {

	public static void main(String[] args) {
		 AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		 MakePayment makePayment=context.getBean(MakePayment.class);
		 makePayment.startPayment();
		 makePayment.stopPayment();
		 try {
			makePayment.exceptionHandling();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 int multiply=makePayment.multiply(10, 2);
		 System.out.println("Multiply is --->"+multiply);
	}
	

}
