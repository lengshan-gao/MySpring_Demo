package com.example.demo;

import org.springframework.stereotype.Service;

/**
 * Created by lengshan on 2018/4/10 0010.
 */
@Service
public class DemoBean {

    public  void output(){
        System.out.println("bean容器中注册了");
    }
}
