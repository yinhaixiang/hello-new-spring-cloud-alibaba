package com.sean.feign.service;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ShareService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public String auditById(Integer id, String message) {

        this.rocketMQTemplate.convertAndSend("add-bonus2", message);

        return "ok";
    }
}
