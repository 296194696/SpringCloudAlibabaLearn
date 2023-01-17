package com.lichunlei.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsSentinelController {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/goods/findport")
    @SentinelResource("findport")
    public String goods(@RequestParam("goods") String goods){
        return "server port:" + port + ",findByGoods:" + goods;
    }

}
