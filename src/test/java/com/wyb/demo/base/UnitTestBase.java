package com.wyb.demo.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * 单元测试基类,负责获取测试用的配置信息
 */
public class UnitTestBase {

	// 应用上下文路径下的XML配置
	private ClassPathXmlApplicationContext context;
	// XML配置路径
	private String springXmlpath;
	
	public UnitTestBase() {}

	/**
	 * 传入 XML配置的路径
	 * 如 classpath:spring-config.xml
	 * 其中 classpath: 表明是类路径下的
	 * @param springXmlpath
     */
	public UnitTestBase(String springXmlpath) {
		this.springXmlpath = springXmlpath;
	}

	/**
	 * 单元测试运行前, 根据XML配置路径读入应用的配置信息. 默认路径为 classpath*:spring-*.xml
	 */
	@Before
	public void before() {
		if (StringUtils.isEmpty(springXmlpath)) {
			springXmlpath = "classpath*:spring-*.xml";
		}
		try {
			context = new ClassPathXmlApplicationContext(springXmlpath.split("[,\\s]+"));
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}


	/**
	 * 单元测试运行后,销毁上下文对象
	 */
	@After
	public void after() {
		context.destroy();
	}

	/**
	 * 从上下文中根据 BeanId 获取 Bean 对象
	 * @param beanId
	 * @param <T>
     * @return
     */
	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId) {
		try {
			return (T)context.getBean(beanId);
		} catch (BeansException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 从上下文中根据 类对象,获取实例对象
	 * @param clazz
	 * @param <T>
     * @return
     */
	protected <T extends Object> T getBean(Class<T> clazz) {
		try {
			return context.getBean(clazz);
		} catch (BeansException e) {
			e.printStackTrace();
			return null;
		}
	}
}
