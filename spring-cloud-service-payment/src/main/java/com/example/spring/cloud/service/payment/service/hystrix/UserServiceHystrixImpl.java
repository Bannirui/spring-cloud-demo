package com.example.spring.cloud.service.payment.service.hystrix;

import com.example.spring.cloud.service.payment.service.feign.UserService;
import org.springframework.stereotype.Component;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/14
 * @Description:
 */
@Component
public class UserServiceHystrixImpl implements UserService {
    @Override
    public String getUserNameById(Long id) {
        return String.format("Not Request %s", id);
    }
}
