package com.wyb.demo.ioc.scope;

/**
 * Created by wyb on 2017/3/6.
 */
public class BeanScope {

    public void say() {
        System.out.println(this.getClass().getSimpleName() + " " + this.hashCode());
    }
}
