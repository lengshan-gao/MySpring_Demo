package com.example;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
/**
 * Created by lengshan on 2018/4/17 0017.
 */
public class WebInit implements WebApplicationInitializer{

    // @Override代表重写，但是这里就报语法错误所以删除

    public void onStartup(ServletContext servletContext) throws ServletException{
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyConfig.class);
        context.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet =servletContext.addServlet("dispatcher",new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
