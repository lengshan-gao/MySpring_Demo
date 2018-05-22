package com.example.demo;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListService() {
        return "ls";
    }
}
