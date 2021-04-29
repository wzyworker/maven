package com.wzy.service.impl;

import com.wzy.service.SomeService;
import org.springframework.stereotype.Component;

/**
 * @author wzy
 */

@Component
public class SomeServiceImpl implements SomeService {

    /**
     * 需要给该方法增加一个功能，在方法执行前，输出该方法的执行时间
     * @param name 需要传输一个名字
     * @param age 需要创出一个年龄
     */
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("===========目标方法doSome===============");
    }

    @Override
    public int doOther(String name, Integer age) {
        System.out.println("连接数据库，插入信息");
        return 0;
    }
}
