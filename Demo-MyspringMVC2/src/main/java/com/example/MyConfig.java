package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by lengshan on 2018/4/17 0017.
 *
 *
 * EnableWebMvc注解用于开启默认的MVC配置
 * 这里配置了jsp的viewResolver 用于映射路径和实际页面的位置
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.example")
public class MyConfig {
   @Bean
    public InternalResourceViewResolver viewResolver(){
       InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
       //这里写的是运行时的路径，就是mavn 默认web放置的路径
       viewResolver.setPrefix("/WEB-INF/classes/views/");
       viewResolver.setSuffix(".jsp");
       viewResolver.setViewClass(JstlView.class);
       return viewResolver;
   }

}
