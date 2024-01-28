package com.example.springbootdemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@ConfigurationProperties("student")
@Data
public class Student {
    private int id;
    private String name;
    private int age;
}
