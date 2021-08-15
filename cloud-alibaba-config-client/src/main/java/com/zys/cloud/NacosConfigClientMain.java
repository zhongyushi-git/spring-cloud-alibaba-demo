package com.zys.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain.class,args);
    }
}
