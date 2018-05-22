package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSpringcongditionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringcongditionalApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		ListService listService = context.getBean(ListService.class);
		System.out.println(listService.showListService());

		context.close();

	}
}
