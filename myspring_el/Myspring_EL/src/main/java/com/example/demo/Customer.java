package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/2 0002.
 */
@Component("customerBean")
public class Customer {

    @Value("#{itemBean}")
    private Item item;

    @Value("#{itemBean.name}")
    private String name;

    public Item getBean(){
        return item;
    }
    public String getName(){
        return name;
    }
    public void setItem(Item item){
        this.item = item;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "itemBean:"+item+"name:"+name;
    }
}
