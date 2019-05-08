package com.wjj.springcloud.provider3.service;

import com.wjj.springcloud.api.entity.Dept;

import java.util.List;

/**
 * Author:   WangJingjie
 * Date:     2019/5/6 18:16
 * Description:
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
