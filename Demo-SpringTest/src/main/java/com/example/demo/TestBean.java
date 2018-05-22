package com.example.demo;

/**
 * Created by lengshan on 2018/4/10 0010.
 */
public class TestBean {
    private String context;
    //构造方法初始化
    public TestBean(String context){
        super();
        this.context = context;
    }

    public String getContext() {
        System.out.println("古之立大事者，不惟有超世之才，亦必有坚韧不拔之志");
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
