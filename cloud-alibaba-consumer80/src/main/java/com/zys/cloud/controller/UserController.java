package com.zys.cloud.controller;

import com.zys.cloud.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/get")
    public String get() {
        return userClient.get();
    }
}
