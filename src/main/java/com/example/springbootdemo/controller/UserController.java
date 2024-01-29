package com.example.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
//    1.得到日志对象
    private static final Logger logger= LoggerFactory.getLogger(UserController.class);
    @RequestMapping("/hi")
    public String sayhi(){
        logger.trace("this is trace");
        logger.debug("this id debug");
        logger.info("this is info");
        logger.warn("this is warn");
        logger.error("this is error");
        return "写日志";
    }
}
