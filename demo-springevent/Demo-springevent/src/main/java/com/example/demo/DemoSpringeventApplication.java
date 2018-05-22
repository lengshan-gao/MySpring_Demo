package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Alt+Enter 引入jar包快捷方式
 */
@SpringBootApplication
public class DemoSpringeventApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringeventApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		DemoEventPublish demoEventPublish =  context.getBean(DemoEventPublish.class);
		demoEventPublish.publish("哈哈哈!!");
		context.close();
	}
}
