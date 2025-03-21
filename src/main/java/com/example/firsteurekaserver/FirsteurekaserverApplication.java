package com.example.firsteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FirsteurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirsteurekaserverApplication.class, args);
    }

}
