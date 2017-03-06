package com.wyb.demo.ioc.leftcycle;

/**
 * Created by wyb on 2017/3/6.
 */
public class BeanLifeCycleTwo {

    /**
     * bean 对象被初始化时调用
     * 在 XML 中定义
     */
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " start()");
    }

    public void say() {
        System.out.println(this.getClass().getSimpleName() + " is saying hello.");
    }

    /**
     * bean 对象被销毁时调用
     * 在 XML 中定义
     */
    public void finish() {
        System.out.println(this.getClass().getSimpleName() + " finish()");
    }
}
