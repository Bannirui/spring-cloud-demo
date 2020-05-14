package com.example.spring.cloud.service.payment.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/14
 * @Description:
 */
@FeignClient(value = "spring-cloud-service-user")
public interface UserService {

    @GetMapping("service-user/user/getUserNameById")
    public String getUserNameById(@RequestParam(value = "id", required = true) Long id);
}
