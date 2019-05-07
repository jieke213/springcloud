package com.wjj.springcloud.consumer.controller;

import com.wjj.springcloud.api.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Author:   WangJingjie
 * Date:     2019/5/7 13:58
 * Description:
 */
@Controller
public class DeptConsumerController {

    public static final String BASE_URL="http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/dept/add")
    @ResponseBody
    public boolean add(Dept dept){
       return restTemplate.postForObject(BASE_URL+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    @ResponseBody
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(BASE_URL+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    @ResponseBody
    public List<Dept> list(){
        return restTemplate.getForObject(BASE_URL+"/dept/list",List.class);
    }
}
