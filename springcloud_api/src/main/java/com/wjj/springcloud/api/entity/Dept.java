package com.wjj.springcloud.api.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Author:   WangJingjie
 * Date:     2019/5/6 10:03
 * Description:
 */
@Getter
@Setter
public class Dept implements Serializable {
    private Long deptNo;
    private String deptName;
    private String dbSource;

    public static void main(String[] args) {
        Dept dept=new Dept();
        dept.setDeptNo(11L);
        System.out.println(dept.getDeptNo());
    }
}
