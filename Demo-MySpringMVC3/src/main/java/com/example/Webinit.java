package com.example;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by lengshan on 2018/4/25 0025.
 *
 * 引入配置文件 创建dispatcherservlet前端控制器
 * 设置映射方式和启动机制
 *
 * 这里重写的onStart方法,只要在程序启动后就会启动
 */
public class Webinit implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext)throws ServletException{

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        //注册配置文件
        context.register(MvcConfig.class);
        context.setServletContext(servletContext);
        //配置dispatcherservlet  前端控制器
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher",new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        System.out.println("历尽天华成此景，人间万事出艰辛！");
    }

}
