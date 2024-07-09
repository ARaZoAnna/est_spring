package com.example.est_spring;


import com.example.day0709.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.DispatcherServlet;


@SpringBootApplication(
        scanBasePackages = "com.example.day0709")
public class EstSpringApplication {

    @Autowired
    @Qualifier("sendMessage")
    Message message;
    public static void main(String[] args) {

        SpringApplication.run(EstSpringApplication.class, args);

    }

}
