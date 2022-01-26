package com.circleci.demojavaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJavaSpringApplication {

    public static void main(String[] args) {
        System.out.println("Running app..");
        SpringApplication.run(DemoJavaSpringApplication.class, args);
    }
}
