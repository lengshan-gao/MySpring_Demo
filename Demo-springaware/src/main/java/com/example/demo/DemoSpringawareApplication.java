package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSpringawareApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringawareApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);

		DemoBean demo = context.getBean(DemoBean.class);
		demo.outputResult();
		context.close();
	}
}
