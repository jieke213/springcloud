package com.wjj.springcloud.provider2.dao;

import com.wjj.springcloud.api.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author:   WangJingjie
 * Date:     2019/5/6 18:12
 * Description:
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
