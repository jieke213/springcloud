package com.wjj.springcloud.provider3.service.impl;

import com.wjj.springcloud.api.entity.Dept;
import com.wjj.springcloud.provider3.dao.DeptDao;
import com.wjj.springcloud.provider3.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:   WangJingjie
 * Date:     2019/5/6 18:18
 * Description:
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }

}
