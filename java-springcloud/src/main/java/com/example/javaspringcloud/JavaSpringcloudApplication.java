package com.example.javaspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableEurekaServer
@SpringBootApplication

public class JavaSpringcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringcloudApplication.class, args);
    }

}
