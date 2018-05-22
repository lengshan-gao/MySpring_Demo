package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoMyprofileApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMyprofileApplication.class, args);
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(MyConfig.class);
		context.refresh();
		/**
		 * 先将活动的profile设置为dev
		 * 然后注册Bean的配置类，不然会报Bean未定义的错误
		 * 刷新容器
		 */

		DemoBean bean = context.getBean(DemoBean.class);
		System.out.println(bean.getContent());

		context.close();


	}
}
