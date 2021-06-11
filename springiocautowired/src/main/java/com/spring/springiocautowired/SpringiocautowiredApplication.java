package com.spring.springiocautowired;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringiocautowiredApplication {

	public static void main(String[] args) {
		  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WheelerConfig.class);
	      FourWheeler fourWheeler = context.getBean(FourWheeler.class);
	      
	      System.out.println(fourWheeler.getVehicleType());
	      context.close();
		
	}

}
