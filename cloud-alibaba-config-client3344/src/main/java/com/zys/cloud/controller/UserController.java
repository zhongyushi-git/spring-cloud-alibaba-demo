package com.zys.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//动态刷新
@RefreshScope
public class UserController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/config/get")
    public String get() {
        return "The config info is :" + info;
    }
}
