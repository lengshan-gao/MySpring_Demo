package com.example.demo;

import org.springframework.stereotype.Service;

/**
 * Created by lengshan on 2018/3/13 0013.
 */

public class DemoBean {
  private String content;

  public DemoBean(String content){
      super();
      this.content = content;
  }

  public String getContent(){

      return content;
  }

  public void setContent(String content){
      this.content = content;
  }
}
