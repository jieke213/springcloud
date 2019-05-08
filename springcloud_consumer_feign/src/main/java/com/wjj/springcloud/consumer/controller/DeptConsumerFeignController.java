package com.wjj.springcloud.consumer.controller;

import com.wjj.springcloud.api.entity.Dept;
import com.wjj.springcloud.api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
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
public class DeptConsumerFeignController {

    @Autowired
    private DeptClientService service;

    @RequestMapping("/consumer/dept/add")
    @ResponseBody
    public boolean add(Dept dept){
       return service.add(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    @ResponseBody
    public Dept get(@PathVariable("id") Long id){
        return service.get(id);
    }

    @RequestMapping("/consumer/dept/list")
    @ResponseBody
    public List<Dept> list(){
        return service.list();
    }

}
