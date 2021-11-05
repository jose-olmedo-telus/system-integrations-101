package com.telusinternational.dsu.performance;

import com.telusinternational.dsu.performance.controllers.ReviewController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"com.telusinternational.dsu.performance.service", "com.telusinternational.dsu.performance.controllers"})
public class ReviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewApplication.class, args);
    }

}
