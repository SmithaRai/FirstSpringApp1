package com.example.firstspringapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FirstSpringApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApp1Application.class, args);
    }


}
