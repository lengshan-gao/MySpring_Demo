package com.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lengshan on 2018/4/25 0025.
 * @ControllerAdvice ����������---�������������ִ��cotrolerע��Ŀ������Ͻ��в��������׳��쳣
 * ���ο��������������
 *
 * ��ִ��controllerע�����ʱ�����@ControllerAdviceע�����
 *
 *
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    //@ExceptionHandler ����ȫ�ֵ��쳣������������������valueֵ��������controller���淽������ֱ���׳��쳣

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception e,WebRequest request){
        //�������ֱ�Ӷ�λ��error.jspҳ�棬������ô��λ�Ĳ����
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMsg",e.getMessage());
        return modelAndView;
    }

    /**����Ԥ����һ����ֵ�Բ���������Ӧ��@RequestMappingע��ķ��������Խ��մ˲���
     * ֻ��Ҫ�������Ĳ���ʹ��@ModelAttribute ע��Ϳ��Է������ȫ�ֵı���
     * @param model
     */

    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg","������Ϣ");

    }

    /**
     * ����������ǿ���Ԥ����ǰ̨�����Ĳ������������ε�ĳ������
     * requestʹ�ö��������ղ����ģ�id��ʧЧ���������β����е�id
     * @param webDataBinder
     */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id");

    }
}
