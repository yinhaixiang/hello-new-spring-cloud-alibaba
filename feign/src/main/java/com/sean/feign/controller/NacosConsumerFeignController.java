package com.sean.feign.controller;

import com.sean.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NacosConsumerFeignController {

    @Autowired
    private EchoService echoService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/echo/hi")
    public String echo() {
        return echoService.echo("Hi Feign");
    }


    /**
     * 测试: 服务发现, 证明总能找到provider
     * @return provider所有实例的地址信息
     */
    @GetMapping("test2")
    public List<ServiceInstance> getInstances() {
        return this.discoveryClient.getInstances("nacos-provider");
    }


    /**
     * 测试: 查询所有注册到注册中心的服务
     * @return 所有服务列表
     */
    @GetMapping("test3")
    public List<String> getServices() {
        return this.discoveryClient.getServices();
    }
}