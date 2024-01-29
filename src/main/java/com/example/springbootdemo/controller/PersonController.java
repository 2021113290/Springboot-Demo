package com.example.springbootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/p")
@Slf4j
public class PersonController {
    @RequestMapping("/log")
    public void loggerTest() {
        log.error("------------------- error -----------------");
    }
}