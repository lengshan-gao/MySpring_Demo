package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by lengshan on 2018/4/25 0025.
 *
 * viewResolver 是视图渲染的核心机制，结合request response 把视图返回给浏览器
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.example")
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver viewResolver(){

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;

    }
    //@Overrride 注解是重写方法时使用表示重写
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/asset/**").addResourceLocations("classpath/asset/");
    }

    /**
     * @param registry
     * 注册拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //拦截器里面添加拦截类
        myInterceptors();
    }

    /**
     * @return
     * 返回拦截器类对象
     */
    @Bean
    public MyInterceptor myInterceptors(){
        return new MyInterceptor();
    }

    /**
     * 这两个方法的作用是什么？？？？
     * @param registry
     */
    //快速解决页面转向问题
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/helloworld").setViewName("/hello");
        registry.addViewController("/world").setViewName("/world");
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }
}
