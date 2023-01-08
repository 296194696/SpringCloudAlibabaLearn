package com.lichunlei.nacos.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description 主启动类
 * @Author clli
 * @Date 2022/12/26 23:15
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceGoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceGoodsApplication.class,args);
    }
}
