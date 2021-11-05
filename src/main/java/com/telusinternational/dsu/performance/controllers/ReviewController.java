package com.telusinternational.dsu.performance.controllers;

import com.telusinternational.dsu.performance.Entity.Review;
import com.telusinternational.dsu.performance.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    RestService restService;

    @GetMapping("/hola")
    public String helloWorld() {
        return "HOLA";
    }
    @GetMapping("/")
    public String getReviews() {
        return restService.getReviewsObject();
    }
}
