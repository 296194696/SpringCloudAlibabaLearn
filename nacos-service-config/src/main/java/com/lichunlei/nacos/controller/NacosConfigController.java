package com.lichunlei.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author clli
 * @Date 2023/1/9 22:36
 */
@RefreshScope
@RestController
public class NacosConfigController {

    @Value("${nacos.name}")
    private String name;

    @GetMapping("/nacos/get/config")
    public String getConfig(){
        return "nacos动态配置名称："+name;
    }
}
