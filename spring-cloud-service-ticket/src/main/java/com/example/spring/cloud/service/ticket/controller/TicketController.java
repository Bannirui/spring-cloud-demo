package com.example.spring.cloud.service.ticket.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/14
 * @Description:
 */
@RestController
@RequestMapping("/ticket")
public class TicketController {
    @NacosValue(value = "${server.port}", autoRefreshed = true)
    private Integer port;

    @GetMapping("/getTicketById")
    public String getTicketById(@RequestParam(value = "id", required = true) Long id) {
        String name = "<<猛龙过江>>";
        return String.format("service-ticket服务端口号:[%d] 根据电影票id:[%d]查询到的电影为[%s%d]", port, id, name, id);
    }
}
