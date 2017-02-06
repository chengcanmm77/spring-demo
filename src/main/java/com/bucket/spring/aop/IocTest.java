package com.bucket.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		HelloService helloService = ac.getBean("helloService", HelloService.class);
		helloService.sayHello();
		
		System.out.println(((MessageSource)ac).getMessage("message", null, "Default", null));
	}
}
