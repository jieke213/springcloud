package com.wjj.springcloud.eureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author:   WangJingjie
 * Date:     2019/5/7 17:37
 * Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication2.class,args);
    }
}
