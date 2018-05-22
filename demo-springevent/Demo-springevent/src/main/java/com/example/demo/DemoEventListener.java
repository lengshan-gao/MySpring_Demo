package com.example.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by lengshan on 2018/3/14 0014.
 *
 * 传入类泛型参数为消息的载体DemoBean，实现接口ApplicationListener注册为监听类，并且实现他的方法onApplicationEvent
 * 用于接收载体传过来的数据
 */
@Component
public class DemoEventListener implements ApplicationListener<DemoBean> {

    /**
     *
     * 使用这个方法onApplicationEvent来接收传递的消息
     */
    public void onApplicationEvent(DemoBean demoBean){

        String msg = demoBean.getRecvMessage();

        System.out.println("我DemoEventListener接收到了DemoEvent传递的消息"+msg);

    }
}
