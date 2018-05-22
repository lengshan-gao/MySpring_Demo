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
 * ���������ļ� ����dispatcherservletǰ�˿�����
 * ����ӳ�䷽ʽ����������
 *
 * ������д��onStart����,ֻҪ�ڳ���������ͻ�����
 */
public class Webinit implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext)throws ServletException{

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        //ע�������ļ�
        context.register(MvcConfig.class);
        context.setServletContext(servletContext);
        //����dispatcherservlet  ǰ�˿�����
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher",new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        System.out.println("�����컪�ɴ˾����˼����³�������");
    }

}
