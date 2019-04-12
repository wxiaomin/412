package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.jk.*")
public class SpringcloudWebFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudWebFeignApplication.class, args);
    }

}
