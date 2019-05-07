package com.wjj.springcloud.eureka3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author:   WangJingjie
 * Date:     2019/5/7 17:38
 * Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication3 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication3.class,args);
    }
}
