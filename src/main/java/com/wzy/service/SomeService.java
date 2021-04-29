package com.wzy.service;

/**
 * @author wzy
 */
public interface SomeService {
    /**
     * 用于打印嘘声的名字及年龄
     * @param name 需要传输一个名字
     * @param age 需要创出一个年龄
     */
    public void doSome(String name, Integer age);

    /**
     *  用于连接数据库，并进行添加数据
     * @param name 要添加数据的的名字
     * @param age 要添加数据的的名字
     * @return 表示添加后数据库返回的值
     */
    public int doOther(String name, Integer age);
}
