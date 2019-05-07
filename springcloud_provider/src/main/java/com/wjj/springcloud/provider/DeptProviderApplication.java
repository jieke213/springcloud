package com.wjj.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author:   WangJingjie
 * Date:     2019/5/7 11:10
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApplication.class,args);
    }

    //兔八哥
}
