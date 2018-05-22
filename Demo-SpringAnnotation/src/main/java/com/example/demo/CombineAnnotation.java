package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by lengshan on 2018/4/10 0010.
 * 这里验证使用自定义组合注解代替spring 的元注解
 * @Target(ElementType.TYPE)表示注解的使用范围 Target通过ElementType的枚举值来确定适用范围
 * TYPE:类或接口  METHOD:用于方法上 CONSTRUCTOR:构造方法上
 * @Retention(RetentionPolicy.RUNTIME) 表示被他所标注的注解的保留时间
 * SOURCE代码级编译时忽略  CLASS默认的编译时保留JVM忽略  RUNTIME JVM保留所以他能在运行时被JVM读取和使用
 * @Documented  表明这个注解应该被javadoc之类的工具处理
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface CombineAnnotation {
     String[] value();
}
