package com.wyb.demo.interfaces;

import com.wyb.demo.base.UnitTestBase;
import com.wyb.demo.ioc.interfaces.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by wyb on 2017/3/6.
 */
// 用于定义 JUnit 的运行类 BlockJUnit4ClassRunner 是 JUnit的一个默认运行类. Spring 也有自己的单元测试运行类, 使用时可在此处配置.
@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

    // 指明该次测试所用到的配置XML位置
    public TestOneInterface() {
        // 到 classpath 路径下找 spring-ioc.xml 文件
        super("classpath:spring-ioc.xml");
    }

    @Test
    public void testSay() {
        // 根据XML配置信息,获取一个 叫 oneInterface 的Bean 对象. 该方法返回一个 OneInterfaceImpl的一个实例
        OneInterface oneInterface = super.getBean("oneInterface");
        oneInterface.say("This is a cat.");
        OneInterface anotherOneInterface = super.getBean("anotherOneInterface");
        anotherOneInterface.say("This is a dog.");
    }
}
