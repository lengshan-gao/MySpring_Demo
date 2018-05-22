package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.model.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import com.howtodoinjava.demo.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by lengshan on 2018/4/12 0012.
 */
@Service
public class EmployeeManagerImpl implements EmployeeManager{

    @Autowired
    EmployeeDao dao;

    public List<EmployeeVO> getAllEmployees()
    {
        return dao.getAllEmployees();
    }
}
