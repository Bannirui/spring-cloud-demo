package com.example.spring.cloud.service.ticket;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
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
@NacosPropertySource(dataId = "application.yml", groupId = "spring-cloud-service-ticket", autoRefreshed = true, type = ConfigType.YAML)
public class ServiceTicketApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceTicketApplication.class, args);
    }
}
