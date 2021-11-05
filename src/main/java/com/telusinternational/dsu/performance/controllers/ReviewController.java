package com.telusinternational.dsu.performance.controllers;

import com.telusinternational.dsu.performance.Entity.Review;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @GetMapping("/hola")
    public String helloWorld() {
        return "HOLA";
    }
    @GetMapping("/")
    public Review[] getReviews() {
        RestTemplate restTemplate = new RestTemplate();
        Review[] reviews = restTemplate.getForObject("http://localhost:8080/api/employees", Review[].class);
        System.out.println(reviews);
        return reviews;
    }
}
