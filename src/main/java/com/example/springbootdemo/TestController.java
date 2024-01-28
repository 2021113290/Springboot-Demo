package com.example.springbootdemo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
@ResponseBody
public class TestController {
    @Value("${mytest}")
    private String mytest;
    @Value("${mytest2}")
    private String mytest2;
    @Value("${myString}")
    private String myString;
    @Value("${myString1}")
    private String myString1;
    @Value("${myString2}")
    private String myString2;
    @Value("${myString3}")
    private String myString3;
    @Autowired
    private Student student;
    @Autowired
    private ListConfig listConfig;
    @PostConstruct
    public void postConstruct(){
        System.out.println("myString:"+myString);
        System.out.println("myString1:"+myString1);
        System.out.println("myString2:"+myString2);
        System.out.println("myString3:"+myString3);
        System.out.println("Student:"+student.toString());
        System.out.println("List:"+ listConfig.toString());
    }
    @RequestMapping("/hi")
    public String sayHi(String name){
        if (!StringUtils.hasLength(name)){
            name="momo";
        }
        return "hi!"+name;
    }
    @RequestMapping("/getconf")
    public String getConfig(){
        return mytest+" and "+mytest2;
    }
}
