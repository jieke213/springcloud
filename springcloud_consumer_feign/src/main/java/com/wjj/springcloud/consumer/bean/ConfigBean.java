package com.wjj.springcloud.consumer.bean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Author:   WangJingjie
 * Date:     2019/5/7 13:56
 * Description:
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /*@Bean
    public IRule getRuble(){
        *//**
         * ribbon的轮询策略
         *//*
        //轮询
        //return new RoundRobinRule();

        //随机
        //return new RandomRule();

        //重试
        //return new RetryRule();
    }*/
}
