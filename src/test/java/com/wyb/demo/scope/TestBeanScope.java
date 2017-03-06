package com.wyb.demo.scope;

import com.wyb.demo.base.UnitTestBase;
import com.wyb.demo.ioc.scope.AnotherBeanScope;
import com.wyb.demo.ioc.scope.BeanScope;
import org.junit.Test;

/**
 * Created by wyb on 2017/3/6.
 */
public class TestBeanScope extends UnitTestBase {

    public TestBeanScope() {
        super("classpath:spring-scope.xml");
    }

    /**
     * 当 XML 中 Bean 的 scope 为 singleton 时, 创建的两个引用指向同一个对象
     */
    @Test
    public void testSay() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }

    /**
     * 当 XML 中 Bean 的 scope 为 singleton 时, 创建的两个引用分别指向不同的对象
     */
    @Test
    public void testSay2() {
        AnotherBeanScope anotherBeanScope = super.getBean("anotherBeanScope");
        anotherBeanScope.say();

        AnotherBeanScope anotherBeanScope2 = super.getBean("anotherBeanScope");
        anotherBeanScope2.say();
    }
}
