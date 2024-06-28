package com.example.est_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstSpringApplication {
    @Value("${kakao.api.key}")
    private String name;

    public static void main(String[] args) {
        UserRepositoryInterface userRepository = new UserRepository();


        SpringApplication.run(EstSpringApplication.class, args);

        /*UserRepositoryInterface userRepository = new UserRepository();
        UserRepositoryInterface userRepository2 = new UserRepository2();

        UserService userService = new UserService(userRepository);
        UserService userService1 = new UserService(userRepository2);

        userService.createUser(new User());
        userService1.createUser(new User());

        SpringApplication.run(EstSpringApplication.class, args);*/
    }

}
