package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyspringElApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringElApplication.class, args);
		//获取AnnotationConfigApplicationContext容器里的bean,通过MyConfig配置把路径下的所有bean都放到AnnotationConfigApplicationContext容器里
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		Customer cus = (Customer) context.getBean("customerBean");
		School scl = (School) context.getBean("schoolBean");

		//System.out.println(cus);

		System.out.println(scl);

	}
}
