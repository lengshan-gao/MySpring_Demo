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
 * viewResolver ����ͼ��Ⱦ�ĺ��Ļ��ƣ����request response ����ͼ���ظ������
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
    //@Overrride ע������д����ʱʹ�ñ�ʾ��д
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/asset/**").addResourceLocations("classpath/asset/");
    }

    /**
     * @param registry
     * ע��������
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //�������������������
        myInterceptors();
    }

    /**
     * @return
     * ���������������
     */
    @Bean
    public MyInterceptor myInterceptors(){
        return new MyInterceptor();
    }

    /**
     * ������������������ʲô��������
     * @param registry
     */
    //���ٽ��ҳ��ת������
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
