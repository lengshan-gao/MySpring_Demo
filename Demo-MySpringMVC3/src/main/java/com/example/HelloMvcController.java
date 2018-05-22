package com.example;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lengshan on 2018/4/25 0025.
 */
@RestController
@RequestMapping("/rest")
public class HelloMvcController {

    @RequestMapping("/user/{str}")
    public String hello(@PathVariable String str,HttpServletRequest request){
        System.out.println("--------------------------》"+str);
        return "world";
    }

    @RequestMapping(value ="/users/{str}",produces = "application/json;charset=UTF-8")
    public String hi(@PathVariable String str,HttpServletRequest request){
        System.out.println("-------------------------》"+str);
        return "hello";
    }

    @RequestMapping(value ="/except",produces ="application/json;charset=UTF-8")
    public void except(@ModelAttribute("msg") String msg, Demobean demobean){
        System.out.println("except---------------------》"+msg+"name:"+demobean.getName()+"id:"+demobean.getId());
        //直接抛出异常
        throw new IllegalArgumentException("抱歉参数异常/来自@ModelAttribute"+msg);
    }



}
