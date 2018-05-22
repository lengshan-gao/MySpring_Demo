package com.example.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


/**
 * Created by lengshan on 2018/3/14 0014.
 *
 * 这个bean继承ApplicationEvent，通过事件发布来传递消息，是消息传递的载体
 */

public class DemoBean extends ApplicationEvent{

    private static final long serialVersionUID = 1L;

    private String recvMessage;

    public DemoBean (Object source,String recvMessage){
        super(source);
        this.recvMessage = recvMessage;
    }

    public String getRecvMessage() {
        return recvMessage;
    }

    public void setRecvMessage(String recvMessage) {
        this.recvMessage = recvMessage;
    }
}
