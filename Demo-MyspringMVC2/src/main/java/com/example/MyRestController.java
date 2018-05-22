package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lengshan on 2018/4/25 0025.
 * ����ע��ע�ⲻ�ܺ������ظ�
 */
@RestController
@RequestMapping("/rest")
public class MyRestController {

    @RequestMapping(value = "/user",produces = "application/json;charset=UTF-8")
    public Userbean getjson(Userbean userbean){
         return userbean;
    }

    @RequestMapping(value="/user",produces ="application/xml;charset=UTF-8")
    public Userbean getxml(Userbean userbean){
        return userbean;
    }

}
