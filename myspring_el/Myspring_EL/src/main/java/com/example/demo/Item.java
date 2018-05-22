package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/2 0002.
 */
@Component("itemBean")
public class Item {

    @Value("nameA")
    private String name;

    @Value("10010")
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "total:"+total+"name:"+name;
    }
}
