package com.wjj.consumer.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Author:   WangJingjie
 * Date:     2019/5/9 10:13
 * Description:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashboardApplication.class,args);
    }
}
