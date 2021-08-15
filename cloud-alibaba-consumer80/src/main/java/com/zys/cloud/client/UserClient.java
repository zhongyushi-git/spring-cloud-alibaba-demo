package com.zys.cloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "cloud-alibaba-nacos-provider")
public interface UserClient {

    @GetMapping("/user/get")
    String get();
}
