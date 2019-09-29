package com.sean.feign.controller;

import com.sean.feign.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/shares")
public class ShareAdminController {

    @Autowired
    private ShareService shareService;

    @GetMapping("/audit")
    public String auditById() {
        System.out.println("send...");
        return this.shareService.auditById(2, "你好吗");
    }

}
