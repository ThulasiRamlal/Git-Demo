package com.lcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringFrameworkApplication.class, args);
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring1.xml");
	Laptop laptop=(Laptop)ac.getBean("laptop");	
	laptop.build();
	}

}
