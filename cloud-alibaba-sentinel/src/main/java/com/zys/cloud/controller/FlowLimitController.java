package com.zys.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "--------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "--------testB";
    }

    @GetMapping("/testC")
    @SentinelResource(value = "aaa", blockHandler = "testCBlockHandler",fallback = "testCFallback")
    public String testC(Integer id) {
        if (id < 0) {
            throw new RuntimeException("参数值格式错误");
        }
        return "--------testC";
    }

    //自定义降级或熔断时的提示信息
    public String testCBlockHandler(Integer id, BlockException exception) {
        //判断异常的类型
        if (exception instanceof FlowException) {
            return "你被限流了，请稍后再试";
        } else if (exception instanceof DegradeException) {
            return "你被降级了，请稍后再试";
        }
        return "当前服务不可用";
    }

    //自定义未限流时发生异常的提示信息
    public String testCFallback(Integer id){
        return "参数不合法";
    }


}