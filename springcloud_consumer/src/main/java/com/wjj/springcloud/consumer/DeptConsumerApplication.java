package com.wjj.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author:   WangJingjie
 * Date:     2019/5/7 14:12
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication.class,args);
    }
}
