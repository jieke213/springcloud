package com.wjj.springcloud.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author:   WangJingjie
 * Date:     2019/5/8 14:37
 * Description:
 */
@Configuration
public class MyRule {

    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
