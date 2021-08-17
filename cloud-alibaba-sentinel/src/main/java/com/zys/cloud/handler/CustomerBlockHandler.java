package com.zys.cloud.handler;
import com.alibaba.csp.sentinel.slots.block.BlockException;

public class CustomerBlockHandler {

    public static String handlerException(BlockException exception){
        return "按客户自定义，global handlerException-----1";
    }
    public static String handlerException2(BlockException exception){
        return "按客户自定义，global handlerException-----2";
    }
}