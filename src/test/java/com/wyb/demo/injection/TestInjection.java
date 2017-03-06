package com.wyb.demo.injection;

import com.wyb.demo.base.UnitTestBase;
import com.wyb.demo.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by wyb on 2017/3/6.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

    public TestInjection() {
        super("classpath:spring-injection.xml");
    }

    /**
     * 以 setter 的方式获取 注入对象
     */
    @Test
    public void testSetter() {
        InjectionService service = super.getBean("injectionServiceBySetter");
        service.save("dog");
    }

    /**
     * XML 中以构造器的方式获取注入对象
     */
    @Test
    public void testCon() {
        InjectionService service = super.getBean("injectionServiceByConstructor");
        service.save("cat");
    }
}
