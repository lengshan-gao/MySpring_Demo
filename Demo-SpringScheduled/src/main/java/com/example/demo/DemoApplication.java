package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	private static final SimpleDateFormat format= new SimpleDateFormat("HH:MM:SS");

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		ScheduledTaskService schedule = context.getBean(ScheduledTaskService.class);

        System.out.println("当前时间"+format.format(new Date()));

	}
}
