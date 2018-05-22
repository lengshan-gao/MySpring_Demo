package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSpringexcutortaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringexcutortaskApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Demo_Thread.class);

		Demo_Task task =context.getBean(Demo_Task.class);
        //结果是并发执行而不是顺序执行，如果不是放在线程池里面就会顺序执行
		for(int i=0;i<100;i++){
			task.excuteAsynTask(i);
			task.excueAsynTask2(i);
		}
		context.close();

	}
}
