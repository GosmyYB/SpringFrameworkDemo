package com.wyb.demo.ioc.injection.service;

import com.wyb.demo.ioc.injection.dao.InjectionDAO;

/**
 * Created by wyb on 2017/3/6.
 */
public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    /**
     * 必须提供一个默认的 constructor, 否则以 setter 方式注入会报错
     */
    public InjectionServiceImpl() {

    }

    /**
     * 使用 constructor 注入
     * @param injectionDAO
     */
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    /**
     * 使用 setter 注入
     */
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String model) {
        System.out.println(this.getClass().getSimpleName() + "模拟业务操作");
        // 对model进行处理 将其变为大写
        String targetModel = model.toUpperCase();
        // 交给DAO处理
        injectionDAO.save(targetModel);
    }
}
