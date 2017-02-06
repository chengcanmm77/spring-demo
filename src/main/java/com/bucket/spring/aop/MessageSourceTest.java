package com.bucket.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageSourceTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		System.out.println(((MessageSource)ac).getMessage("message", null, "Default", null));
		String[] str = {"chengcanming"};
		System.out.println(((MessageSource)ac).getMessage("message2", str, "Default", null));
	}
}
