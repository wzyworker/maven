package com.wzy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wzy
 * @Aspect :表示当前类是切面类
 * 方法定义的要求
 *      1.公共方法 public
 *      2.没有返回值
 *      3.名称自定义
 *      4.可以有参数也可以没有参数
 *          果有参数，参数不是自定义的，有几个参数类型可以使用
 */
@Aspect
@Component
public class MyAspectJ {

    @Before(value = "execution(* *..SomeServiceImpl.doSome(..))")
    public void printDate(JoinPoint j){

        Object[] args = j.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        System.out.println("切面功能方法，在目标方法前执行" + new Date());
    }

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",  returning = "res")
    public void myAfterReturning(Object res){
        System.out.println("数据插入是否成功？" + ((Integer) res == 0 ? "是" : "否"));
    }
}
