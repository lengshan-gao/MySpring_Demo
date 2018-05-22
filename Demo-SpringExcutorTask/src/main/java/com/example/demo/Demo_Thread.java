package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by lengshan on 2018/4/3 0003.
 *
 * 创建线程池类
 * @EnableAsync 创建异步任务
 */
@ComponentScan("com.example.demo")
@Configuration
@EnableAsync //开启异步任务支持
public class Demo_Thread implements AsyncConfigurer{

    //重写getAsyncExcutor()返回一个线程池
    public Executor getAsyncExcutor(){

        //创建线程池
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5); //配置线程池的核心线程数
        taskExecutor.setMaxPoolSize(10); //配置线程池的最大线程数
        taskExecutor.setQueueCapacity(25);
        return taskExecutor;

    }

}
