package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lengshan on 2018/4/17 0017.
 * 本例用于展示spring MVC的常用注解
 * @pathvariable 用于接收路径参数
 */
@Controller
@RequestMapping("/anno")
public class UserController {
    //http://localhost:8080/anno
    @ResponseBody
    @RequestMapping(produces="text/plain;charset=UTF-8")
    public  String index(HttpServletRequest request){
        return "url:"+request.getRequestURL()+"can access";
    }
    //http://localhost:8080/anno/pathvar/张三
    @ResponseBody
    @RequestMapping(value ="/pathvar/{str}",produces="text/plain;charset=UTF-8")
    public  String demoPathVar(@PathVariable String str, HttpServletRequest request){
        return "url:"+request.getRequestURL()+"can access"+str;
    }
    //http://loaclhost:8080/anno/requestParam?id=100
    @RequestMapping(value ="/requestParam",produces="text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam( Long id, HttpServletRequest request){
        return "url:"+request.getRequestURL()+"can access"+id;
    }
    //http://localhost:8080/anno/obj?username=张三&userid=123456
    @RequestMapping(value ="/obj",produces="application/json;charset=UTF-8")
    public @ResponseBody String passObj( Userbean userbean, HttpServletRequest request){
        return "url:"+request.getRequestURL()+"can access"+userbean;
    }
    //http:localhost:8080/anno/name1
    //http:localhost:8080/anno/name2
    @RequestMapping(value ={"/name1","/name2"},produces="text/plain;charset=UTF-8")
    public @ResponseBody String remove( HttpServletRequest request){
        return "url:"+request.getRequestURL()+"can access";
    }

}
