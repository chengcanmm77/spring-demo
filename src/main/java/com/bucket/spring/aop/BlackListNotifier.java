package com.bucket.spring.aop;

import org.springframework.context.ApplicationListener;

public class BlackListNotifier implements ApplicationListener<BlackListEvent>{

	@Override
	public void onApplicationEvent(BlackListEvent event) {
		System.out.println("receiver notifer event="+event);
	}

}
