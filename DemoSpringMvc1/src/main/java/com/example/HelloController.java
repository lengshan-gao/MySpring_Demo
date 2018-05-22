package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lengshan on 2018/4/13 0013.
 */
@Controller
@RequestMapping("/index1")
public class HelloController {
    @RequestMapping("/index2")
    public String hello(HttpServletRequest request) {
        System.out.println(request.getParameter("username"));
        return "index";
    }
}
