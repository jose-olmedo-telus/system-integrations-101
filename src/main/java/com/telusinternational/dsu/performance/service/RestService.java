package com.telusinternational.dsu.performance.service;

import com.telusinternational.dsu.performance.Entity.Review;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Review[] getReviewsObject() {
        String url = "http://localhost:8080/api/employees";
        return this.restTemplate.getForObject(url, Review[].class);
    }
}