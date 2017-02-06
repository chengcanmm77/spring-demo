package com.bucket.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		HelloServiceImpl helloService = ac.getBean("helloService", HelloServiceImpl.class);
		helloService.sayHello();
		System.out.println(ac.getParentBeanFactory().getClass().getName());
	}
}
