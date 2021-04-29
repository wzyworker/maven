package com.wzy;

import com.wzy.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wzy
 */
public class MyTest {
    @Test
    public void testAspectJ(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //注意，获取代理对象时，应该将其转换为接口，而不是具体的实现类
        SomeService proxy = (SomeService) ac.getBean("someServiceImpl");
        //proxy.doSome("zs", 6);

        proxy.doOther("ls", 8);
    }
}
