package com.xiaxia.springbootwebrestfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController{

//    @RequestMapping({"/","/index.html"})
//    public String index(){
//        return "index";
//    }

//    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "emps/list";
    }

    @RequestMapping("/c")
    public String Success(Map<String, Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("AA","BB","CC"));
        return "cover";
    }
}