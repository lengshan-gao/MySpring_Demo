package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by lengshan on 2018/4/10 0010.
 */
@Configuration

public class MyConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("dev");
    }

    @Bean
    @Profile("pro")
    public TestBean proTestBean(){
        return new TestBean("pro");
    }
}
