package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by lengshan on 2018/3/13 0013.
 */
@Configuration
//@ComponentScan("com.example.demo")
public class MyConfig {

    /**
     *
     * profile为dev时实例化devBean
     */
    @Bean
    @Profile("dev")
    DemoBean devBean(){

        return new DemoBean("dev");

    }

    /**
     *
     * profile为prod时实例化prodBean
     */
    @Bean
    @Profile("prod")
    DemoBean prodBean(){

        return new DemoBean("prod");

    }

}
