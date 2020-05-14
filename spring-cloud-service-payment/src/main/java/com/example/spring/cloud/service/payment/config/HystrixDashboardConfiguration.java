package com.example.spring.cloud.service.payment.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/14
 * @Description:
 */
@Configuration
public class HystrixDashboardConfiguration {

    // 没有xml 使用类进行设置
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        // 启动顺序
        registrationBean.setLoadOnStartup(1);
        // 路径
        registrationBean.addUrlMappings("/hystrix.stream");
        // 名称
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
