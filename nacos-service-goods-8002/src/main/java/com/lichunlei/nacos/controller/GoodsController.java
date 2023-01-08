package com.lichunlei.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author clli
 * @Date 2022/12/26 23:17
 */
@RestController
public class GoodsController {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/goods/findport")
    public String goods(@RequestParam("goods") String goods){
        return "server port:" + port + ",findByGoods:" + goods;
    }

}
