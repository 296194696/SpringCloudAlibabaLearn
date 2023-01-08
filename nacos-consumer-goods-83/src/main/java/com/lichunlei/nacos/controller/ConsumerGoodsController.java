package com.lichunlei.nacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author clli
 * @Date 2023/1/5 22:58
 */
@RestController
@Slf4j
public class ConsumerGoodsController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-service-good}")
    private String goodsService;

    @GetMapping(value = "/consumer/goods/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(goodsService+"/goods/findport?goods="+id,String.class);
    }
}
