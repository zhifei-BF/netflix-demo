package com.liquor.cloud.consumer.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class CloudConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerUserApplication.class, args);
    }

}
