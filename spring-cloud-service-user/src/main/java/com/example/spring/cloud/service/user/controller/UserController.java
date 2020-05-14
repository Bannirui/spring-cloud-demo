package com.example.spring.cloud.service.user.controller;

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
@RequestMapping("/user")
public class UserController {
    @NacosValue(value = "${server.port}", autoRefreshed = true)
    private Integer port;

    @GetMapping("/getUserNameById")
    public String getUserNameById(@RequestParam(value = "id", required = true) Long id) {
        String name = "Bannirui";
        return String.format("service-user服务端口号:[%d] 根据用户id:[%d]查询到的用户名为[%s%d]", port, id, name, id);
    }
}
