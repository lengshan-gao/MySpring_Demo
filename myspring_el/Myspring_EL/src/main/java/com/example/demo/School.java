package com.example.demo;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;


import java.io.IOException;

/**
 * Created by Administrator on 2018/3/5 0005.
 */
@Component("schoolBean")
@PropertySource(value = "t.properties",encoding = "UTF-8")
public class School {

    @Value("#{item1.teacherName}")
    private String teacher1;
    @Value("#{item1.studentName}")
    private String student1;
    @Value("#{item1.className}")
    private String class1;

   // @Property("t.txt")
    @Value("t.txt")
    private Resource testFile;

    @Value("${sang.username}")
    private String userName;
    @Value("${sang.password}")
    private String passWord;

    private Environment environment;



    public String getTeacher1(String teacher1){

        return teacher1;
    }

    public void setTeacher1(String teacher1){
        this.teacher1 = teacher1;
    }

    public String getStudent1(String student1){
        return student1;
    }
    public void setStudent1(String student1){
        this.student1 = student1;
    }
    public String getClass1(String class1){
        return class1;
    }
    public void setClass1(String class1){

        this.class1 = class1;

    }

    public String toString(){
        try {
            System.out.println(IOUtils.toString(testFile.getInputStream(),"UTF-8"));

            System.out.println("username:"+userName+"password:"+passWord);
            //
            //System.out.println("username1:"+environment.getProperty("sang.nickname"));
        }catch (IOException e){
           e.printStackTrace();
        }
        return "teacher:"+teacher1+"student:"+student1+"class:"+class1+"testFile"+testFile;

    }





}
