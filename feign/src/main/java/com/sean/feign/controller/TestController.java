package com.sean.feign.controller;

import com.sean.feign.dto.ShareAuditDTO;
import com.sean.feign.entity.Share;
import com.sean.feign.service.ShareService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/shares")
public class TestController {

    @Autowired
    private MessageChannel output;

    @GetMapping("test-stream")
    public String testStream() {

        this.output.send(
                MessageBuilder.withPayload("消息体222").build()
        );
        return "success";
    }

}