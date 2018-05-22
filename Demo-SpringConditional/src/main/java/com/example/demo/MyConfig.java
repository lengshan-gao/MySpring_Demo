package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lengshan on 2018/4/10 0010.
 */
@Configuration
//@ComponentScan("com.example.demo")
public class MyConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linusListService(){
        return new LinuxListService();
    }

}
