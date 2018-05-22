package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by lengshan on 2018/3/14 0014.
 */
//bean的声明
@Component
public class DemoEventPublish {
    /**
     * 使用ApplicationContext类来进行发布消息
     */
    //bean的注入
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent(new DemoBean(this,msg));
    }
}
