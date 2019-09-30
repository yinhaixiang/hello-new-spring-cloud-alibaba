package com.sean.provider.rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestStreamConsumer {

    @StreamListener(Sink.INPUT)
    public void receiveInput(String message) {
        log.info("通过stream收到了消息: messageBody={}", message);
    }
}