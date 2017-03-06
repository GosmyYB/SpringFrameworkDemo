package com.wyb.demo.ioc.leftcycle;

/**
 * Created by wyb on 2017/3/6.
 */
public class BeanLifeCycleThree {

    /**
     * 在 XML 的 beans 定义全局使用的init-method
     * bean 对象初始化时将被调用
     */
    public void init() {
        System.out.println(this.getClass().getSimpleName() + " init()");
    }

    public void say() {
        System.out.println(this.getClass().getSimpleName() + " is saying hello.");
    }

    /**
     * 在 XML 的 beans 定义全局的 destroy-method
     * bean 对象销毁时将被调用
     */
    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + " destroy()");
    }
}
