package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by lengshan on 2018/4/3 0003.
 */

@Configuration
@ComponentScan("com.example.demo")
@EnableScheduling  //开启对计划任务的支持
public class MyConfig {
}
