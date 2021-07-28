package com.xxxx.springsecurityoauth2demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.xxxx.springsecurityoauth2demo")
@MapperScan(basePackages = "com.xxxx.springsecurityoauth2demo.model.dao")
public class Springsecurityoauth2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springsecurityoauth2DemoApplication.class, args);
    }

}
