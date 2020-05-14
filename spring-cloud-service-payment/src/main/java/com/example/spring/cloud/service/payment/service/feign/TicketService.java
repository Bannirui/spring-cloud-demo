package com.example.spring.cloud.service.payment.service.feign;

import com.example.spring.cloud.service.payment.service.hystrix.TicketServiceHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/14
 * @Description:
 */
@FeignClient(value = "spring-cloud-service-ticket", fallback = TicketServiceHystrixImpl.class)
public interface TicketService {

    @GetMapping("service-ticket/ticket/getTicketById")
    String getTicketById(@RequestParam(value = "id", required = true) Long id);
}
