package com.wyb.demo.ioc.injection.dao;

/**
 * Created by wyb on 2017/3/6.
 */
public class InjectionDAOImpl implements InjectionDAO {
    @Override
    public void save(String model) {
        System.out.println(this.getClass().getSimpleName() + " handling model=" + model);
        System.out.println(this.getClass().getSimpleName() + "模拟数据库保存操作.");
    }
}
