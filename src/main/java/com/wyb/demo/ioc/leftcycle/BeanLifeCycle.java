package com.wyb.demo.ioc.leftcycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by wyb on 2017/3/6.
 */
public class BeanLifeCycle implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " afterPropertiesSet()");
    }

    public void say() {
        System.out.println(this.getClass().getSimpleName() + " is saying hello.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " destroy()");
    }
}
