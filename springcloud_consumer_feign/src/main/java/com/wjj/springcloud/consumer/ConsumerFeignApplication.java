package com.wjj.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author:   WangJingjie
 * Date:     2019/5/7 14:12
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.wjj.springcloud"})
@ComponentScan("com.wjj.springcloud")
public class ConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class,args);
    }
}
