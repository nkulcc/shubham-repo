package com.spring.ioc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
@ImportResource("classpath:/applicationContext.xml")
public class SpringiocApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringiocApplication.class, args);
		
//		Spring Without IOC
//		  Animal animal = new Dog();
//	         
//	      System.out.println(animal.getFavoritePastime());
	      
//	      Spring with IOC ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {" applicationContext.xml "}); 
	    Animal animal1 = context.getBean("myAnimal", Animal.class);
	    System.out.println("Application Context"+animal1.getFavoritePastime());
	    
	    
//	      Spring with IOC BeanFactory
	    Resource res = new ClassPathResource("applicationContext.xml");
	    BeanFactory factory = new XmlBeanFactory(res);
	    Animal animalB = (Animal) factory.getBean("myAnimal");
	    System.out.println("Bean Factory---->"+animalB.getFavoritePastime());
	            
	}

}
