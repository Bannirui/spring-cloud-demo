package com.example.spring.cloud.service.user;

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
@NacosPropertySource(dataId = "application.yml", groupId = "spring-cloud-service-user", autoRefreshed = true, type = ConfigType.YAML)
public class ServiceUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceUserApplication.class, args);
    }
}
