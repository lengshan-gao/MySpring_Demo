package com.example.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.validation.constraints.AssertTrue;

/**
 * Created by lengshan on 2018/4/3 0003.
 * 异步任务执行类
 */
@Component
public class Demo_Task {

    //创建异步执行方法   @Async注解表明该方法是个异步方法，这里的方法被自动注入ThreadPoolTaskExecutor  作为taskExecutor
    @Async
    public void excuteAsynTask(int i){

        System.out.println("异步执行任务1:"+i+"Thread.currentThread().getName()"+Thread.currentThread().getName());
    }

    public void excueAsynTask2(int i){

        System.out.println("异步执行任务2:"+i+"Thread.currentThread().getName()"+Thread.currentThread().getName());

    }

}
