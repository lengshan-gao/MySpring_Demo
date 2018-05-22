package com.example;

/**
 * Created by lengshan on 2018/4/17 0017.
 */
public class Userbean {

    public String username;
    public Long   userid;

    //jackson对对象和json支持的需要空的构造方法
    public Userbean(){
        super();
    }
    public Userbean(String username,Long userid){
        super();
        this.userid = userid;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
