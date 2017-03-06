package com.wyb.demo.ioc.interfaces;

/**
 * Created by wyb on 2017/3/6.
 */
public class OneInterfaceImpl implements OneInterface {

    @Override
    public void say(String something) {
        System.out.println(this.getClass().getSimpleName() + " is saying " + something);
    }


    public static void main(String[] args) {
        OneInterface oneInterface = new OneInterfaceImpl();
        oneInterface.say("Hello");
    }
}
