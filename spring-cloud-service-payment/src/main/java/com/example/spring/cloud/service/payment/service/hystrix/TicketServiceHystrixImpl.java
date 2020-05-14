package com.example.spring.cloud.service.payment.service.hystrix;

import com.example.spring.cloud.service.payment.service.feign.TicketService;
import org.springframework.stereotype.Component;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/14
 * @Description:
 */
@Component
public class TicketServiceHystrixImpl implements TicketService {
    @Override
    public String getTicketById(Long id) {
        return String.format("Not Request %s", id);
    }
}
