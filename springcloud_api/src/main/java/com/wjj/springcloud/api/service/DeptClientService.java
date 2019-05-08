package com.wjj.springcloud.api.service;

import com.wjj.springcloud.api.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Author:   WangJingjie
 * Date:     2019/5/8 15:47
 * Description:
 */
//@FeignClient(value = "SPRINGCLOUDPROVIDER")
@FeignClient(value = "SPRINGCLOUDPROVIDER",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping("/dept/add")
    public boolean add(Dept dept);

    @RequestMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id);

    @RequestMapping("/dept/list")
    public List<Dept> list();
}
