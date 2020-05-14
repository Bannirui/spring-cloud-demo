package com.example.spring.cloud.service.payment.controller;

import com.example.spring.cloud.service.payment.service.feign.TicketService;
import com.example.spring.cloud.service.payment.service.feign.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/14
 * @Description:
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

    @Value("${server.port}")
    private Integer port;

    @Resource
    private UserService userService;

    @Resource
    private TicketService ticketService;

    @GetMapping("/amount")
    public String amount(@RequestParam(value = "userId", required = true) Long userId,
                         @RequestParam(value = "ticketId", required = true) Long ticketId) {
        String userNameById = userService.getUserNameById(userId);
        String ticketById = ticketService.getTicketById(ticketId);
        return String.format("service-payment服务端口号:[%d]" +
                "\n根据用户id:[%d]调用service-user结果为:[%s]" +
                "\n根据电影票id:[%d]调用service-ticket结果为:[%s]", port, userId, userNameById, ticketId, ticketById);
    }
}
