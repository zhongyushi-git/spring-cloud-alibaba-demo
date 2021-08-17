package com.zys.cloud.controller;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zys.cloud.handler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {

//    @GetMapping("/byResource")
//    @SentinelResource(value = "byResource",blockHandler = "handlerException")
//    public String byResource(){
//        return "按资源名称限流测试OK"+"serial001";
//    }
//    public String handlerException(BlockException exception){
//        return exception.getClass().getCanonicalName()+"\t 服务不可用";
//    }
//
//    @GetMapping("/rateLimit/customerBlockHandler")
//    @SentinelResource(value = "customerBlockHandler",
//            blockHandlerClass = CustomerBlockHandler.class,
//            blockHandler = "handlerException2")
//    public String customerBlockHandler(){
//        return "按客户自定义"+"serial002";
//    }
}