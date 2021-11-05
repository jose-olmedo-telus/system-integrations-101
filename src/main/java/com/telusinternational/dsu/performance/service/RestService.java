package com.telusinternational.dsu.performance.service;

import com.telusinternational.dsu.performance.Entity.Review;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RestService {

    WebClient client = WebClient.create();

    public String getReviewsObject() {
        WebClient.ResponseSpec responseSpec = client.get()
                .uri("http://localhost:8080/api/employees")
                .retrieve();
        String responseBody = responseSpec.bodyToMono(String.class).block();
        return responseBody;
    }
}