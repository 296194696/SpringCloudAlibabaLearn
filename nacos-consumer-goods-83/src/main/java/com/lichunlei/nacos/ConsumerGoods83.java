package com.lichunlei.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description TODO
 * @Author clli
 * @Date 2023/1/5 22:55
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerGoods83 {

    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerGoods83.class,args);
    }
}
