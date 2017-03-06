package com.wyb.demo.lifecycle;

import com.wyb.demo.base.UnitTestBase;
import com.wyb.demo.ioc.leftcycle.BeanLifeCycle;
import com.wyb.demo.ioc.leftcycle.BeanLifeCycleThree;
import com.wyb.demo.ioc.leftcycle.BeanLifeCycleTwo;
import org.junit.Test;

/**
 * Created by wyb on 2017/3/6.
 */
public class TestBeanLifeCycle extends UnitTestBase {

    public TestBeanLifeCycle() {
        super("classpath:spring-lifecycle.xml");
    }

    /**
     * 测试bean对象以实现接口的方式 添加初始化和销毁方法
     */
    @Test
    public void testBeanLifeCycle() {
        BeanLifeCycle beanLifeCycle = super.getBean("beanLifeCycle");
        beanLifeCycle.say();
    }

    /**
     * 测试bean对象以bean自定义的方式 添加初始化和销毁方法
     */
    @Test
    public void testBeanLifeCycleTwo() {
        BeanLifeCycleTwo beanLifeCycleTwo = super.getBean("beanLifeCycleTwo");
        beanLifeCycleTwo.say();
    }

    /**
     *测试bean对象以beans全局定义的方式 添加初始化和销毁方法
     */
    @Test
    public void testBeanLifeCycleThree() {
        BeanLifeCycleThree beanLifeCycleThree = super.getBean("beanLifeCycleThree");
        beanLifeCycleThree.say();
    }
}
