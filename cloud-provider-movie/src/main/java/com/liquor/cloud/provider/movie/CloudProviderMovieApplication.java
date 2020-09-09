package com.liquor.cloud.provider.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderMovieApplication.class, args);
    }

}
