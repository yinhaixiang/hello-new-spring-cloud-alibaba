package com.sean.provider.rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RocketMQMessageListener(consumerGroup = "consumer-group", topic = "add-bonus-topic")
public class AddBonusListener implements RocketMQListener<UserAddBonusMsgDTO> {

    @Override
    public void onMessage(UserAddBonusMsgDTO dto) {
        System.out.println("......" +  dto);
    }
}
