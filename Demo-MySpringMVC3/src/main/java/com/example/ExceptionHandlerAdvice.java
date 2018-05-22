package com.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lengshan on 2018/4/25 0025.
 * @ControllerAdvice 控制器建言---这里的声明会在执行cotroler注解的控制器上进行操作比如抛出异常
 * 屏蔽控制器传入参数等
 *
 * 在执行controller注解的类时会调用@ControllerAdvice注解的类
 *
 *
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    //@ExceptionHandler 设置全局的异常拦截器，拦截条件是value值，后面再controller里面方法测试直接抛出异常

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception e,WebRequest request){
        //这里可以直接定位到error.jsp页面，但是怎么定位的不理解
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMsg",e.getMessage());
        return modelAndView;
    }

    /**这里预设了一个键值对参数，所有应用@RequestMapping注解的方法都可以接收此参数
     * 只需要给方法的参数使用@ModelAttribute 注解就可以访问这个全局的变量
     * @param model
     */

    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg","额外信息");

    }

    /**
     * 这个方法我们可以预处理前台传来的参数，比如屏蔽掉某个参数
     * request使用对象来接收参数的，id会失效，这里屏蔽参数中的id
     * @param webDataBinder
     */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id");

    }
}
