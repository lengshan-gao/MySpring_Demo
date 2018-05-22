package com.example.demo;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.apache.commons.io.IOUtils;
import java.io.IOException;

/**
 * Created by lengshan on 2018/3/22 0022.
 *
 * spring中的bean对spring容器的存在都是没有意识的，甚至我们可以自由的切换容器
 * 但是当我们需要调用spring的资源的时候，我们就需要让bean感知到spring 容器的存在
 * 所以spring给我们提供了spring aware接口
 * BeanNameAware 获得容器中bean的名称
 * BeanFactoryAware获得当前的beanfactory这样可以调用容器的服务
 * MessageSourceAware 获得message source 这样可以获得文本信息
 * ApplicationEventPublisherAware 应用事件发布器，可以发布事件
 * ResourceLoaderAware获得资源加载器，可以获得外部资源文件
 *
 */
@Service
public class DemoBean implements BeanNameAware,ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;

    /**
     *
     * @param resourceLoader
     * @OVerride标签用于重写父类方法
     */
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader){
        this.loader = resourceLoader;
    }
    @Override
    public void setBeanName(String name){
        this.beanName = name;
    }

    /**
     * ctr+alt+t  引入try catch快捷方式
     */
    public void outputResult(){
        System.out.println("Bean的名称为："+beanName);

        //Resource resouce = loader.getResource("classpath:com/example/demo/test.txt");
        Resource resouce = loader.getResource("test.txt");

        try {
            System.out.println("ResourceLoader加载的内容为:"+ IOUtils.toString(resouce.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
