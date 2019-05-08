package com.wjj.springcloud.api.service;

import com.wjj.springcloud.api.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author:   WangJingjie
 * Date:     2019/5/8 17:55
 * Description:
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                Dept dept=new Dept();
                dept.setDeptNo(id);
                dept.setDeptName("该ID"+id+"没有对应的信息,Consumer客户端提供的降级信息，Provider已经关闭");
                dept.setDbSource("No this datasource in mysql");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
