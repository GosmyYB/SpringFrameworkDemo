package com.wyb.demo.ioc.interfaces;

/**
 * Created by wyb on 2017/3/6.
 */
public class AnotherOneInterfaceImpl implements OneInterface {

    @Override
    public void say(String something) {
        System.out.println(this.getClass().getSimpleName() + " is saying " + something);
    }
}
