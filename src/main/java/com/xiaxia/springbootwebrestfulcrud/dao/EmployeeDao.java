package com.xiaxia.springbootwebrestfulcrud.dao;

import com.xiaxia.springbootwebrestfulcrud.entities.Department;
import com.xiaxia.springbootwebrestfulcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDao {

    private static Map<Integer, Employee> employees = null;

    @Autowired
    private  DepartmentDao departmentDao;

    static{
        employees = new HashMap<Integer, Employee>();

        employees.put(1001,new Employee(1001,"E-AA","aa@163.com",1,new Department(101,"D-AA")));
        employees.put(1001,new Employee(1002,"E-BB","bb163.com",1,new Department(102,"D-BB")));
        employees.put(1001,new Employee(1003,"E-CC","cc@163.com",0,new Department(103,"D-CC")));
        employees.put(1001,new Employee(1004,"E-DD","dd@163.com",0,new Department(104,"D-DD")));
        employees.put(1001,new Employee(1005,"E-EE","ee@163.com",1,new Department(105,"D-EE")));
    }

    private static Integer initId = 1006;

    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }
    }


}