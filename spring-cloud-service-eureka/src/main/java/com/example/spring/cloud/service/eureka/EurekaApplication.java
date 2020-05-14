package com.example.spring.cloud.service.eureka;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/14
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
@NacosPropertySource(dataId = "application.yml", groupId = "spring-cloud-service-eureka", autoRefreshed = true, type = ConfigType.YAML)
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
