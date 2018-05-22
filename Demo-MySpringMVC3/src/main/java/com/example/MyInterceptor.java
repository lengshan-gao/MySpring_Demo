package com.example;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lengshan on 2018/4/25 0025.
 */
public class MyInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object o)throws Exception{
        System.out.println("prehandler");
        return true;
    }

    public void postHandle(HttpServletRequest request,HttpServletResponse response,Object o,ModelAndView modelAndView)throws Exception{
        System.out.println("postHandle");

    }

    public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object o,Exception e) throws Exception{
        System.out.println("afterHanle");

    }

}
