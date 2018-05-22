package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoCombineannotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCombineannotationApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		DemoBean demo =context.getBean(DemoBean.class);
		demo.output();
		context.close();
	}
}
