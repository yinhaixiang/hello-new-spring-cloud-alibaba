package com.sean.feign.service;

import com.sean.feign.dto.ShareAuditDTO;
import com.sean.feign.dto.UserAddBonusMsgDTO;
import com.sean.feign.entity.Share;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ShareService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public Share auditById(Integer id, ShareAuditDTO auditDTO) {

        this.rocketMQTemplate.convertAndSend("add-bonus-topic",
                UserAddBonusMsgDTO.builder().userId(77).bonus(50).build());

        return new Share();
    }
}
