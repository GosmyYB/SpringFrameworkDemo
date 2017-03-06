package com.wyb.demo.ioc.scope;

/**
 * Created by wyb on 2017/3/6.
 */
public class AnotherBeanScope {

    public void say() {
        System.out.println(this.getClass().getSimpleName() + " " + hashCode());
    }
}
