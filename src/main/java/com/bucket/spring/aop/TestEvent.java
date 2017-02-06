package com.bucket.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEvent implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
		
	}
	
	public void testEvent(){
		BlackListEvent event = new BlackListEvent(this, "mingcancheng", "hello");
		this.publisher.publishEvent(event);
	}

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		TestEvent te = ac.getBean("testEvent",TestEvent.class);
		te.testEvent();
	}
	
}
