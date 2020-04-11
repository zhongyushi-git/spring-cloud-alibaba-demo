package com.zys.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderMain8002.class,args);
    }
}
