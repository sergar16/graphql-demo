package org.serhii.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class GraphQLApp {
    public static void main(String[] args) {
        SpringApplication.run(GraphQLApp.class, args);
    }
}
