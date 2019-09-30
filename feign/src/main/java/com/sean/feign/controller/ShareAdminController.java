package com.sean.feign.controller;

import com.sean.feign.dto.ShareAuditDTO;
import com.sean.feign.entity.Share;
import com.sean.feign.service.ShareService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/shares")

public class ShareAdminController {

    @Autowired
    private ShareService shareService;

    @PutMapping("/audit/{id}")
    public Share auditById(@PathVariable Integer id, @RequestBody ShareAuditDTO auditDTO) {
        System.out.println(auditDTO);
        return this.shareService.auditById(id, auditDTO);
    }

}