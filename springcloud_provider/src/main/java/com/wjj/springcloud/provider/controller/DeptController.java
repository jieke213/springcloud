package com.wjj.springcloud.provider.controller;

import com.wjj.springcloud.api.entity.Dept;
import com.wjj.springcloud.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping
    @ResponseBody
    public boolean add(Dept dept){
        return deptService.add(dept);
    }

}
