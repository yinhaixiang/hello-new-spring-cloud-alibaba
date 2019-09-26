package com.sean.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class NacosConsumerConfiguration {

    @Bean
    @LoadBalanced // 此注解使用ribbon的时候才加, 否则去掉
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}