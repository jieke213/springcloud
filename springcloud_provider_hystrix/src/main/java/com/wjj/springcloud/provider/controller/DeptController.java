package com.wjj.springcloud.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wjj.springcloud.api.entity.Dept;
import com.wjj.springcloud.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author:   WangJingjie
 * Date:     2019/5/7 9:50
 * Description:
 */
@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "processHystrix")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.get(id);
        if (dept == null){
            throw new RuntimeException("该ID"+id+"没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix(@PathVariable("id") Long id){
        Dept dept=new Dept();
        dept.setDeptNo(id);
        dept.setDeptName("该ID"+id+"没有对应的信息,@HystrixCommand");
        dept.setDbSource("No this datasource in mysql");
        return dept;
    }

}
