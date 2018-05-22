package com.howtodoinjava.demo.dao;

import com.howtodoinjava.demo.model.EmployeeVO;
import java.util.List;

/**
 * Created by lengshan on 2018/4/12 0012.
 */
public interface EmployeeDao {
    public List<EmployeeVO> getAllEmployees();
}
