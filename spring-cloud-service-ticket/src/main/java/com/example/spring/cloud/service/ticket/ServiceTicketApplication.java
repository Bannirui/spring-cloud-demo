package com.example.spring.cloud.service.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/14
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceTicketApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceTicketApplication.class, args);
    }
}
