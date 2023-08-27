package com.learnDependencyInjection.dependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {
	public static void main(String[] args) {
//		SpringApplication.run(DependencyInjectionApplication.class, args);
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(DIConfiguration.class);
//		System.out.println(context.getBean("person2"));
//		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean(Person.class));
	}

}
