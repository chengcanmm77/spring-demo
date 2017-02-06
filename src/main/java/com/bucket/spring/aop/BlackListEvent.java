package com.bucket.spring.aop;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent{
	private static final long serialVersionUID = -6972232862149614716L;
	private final String address;
    private final String test;
    
	public BlackListEvent(Object source, String address, String test) {
		 super(source);
	     this.address = address;
	     this.test = test;
	}

	@Override
	public String toString() {
		return "BlackListEvent [address=" + address + ", test=" + test + "]";
	}

	
}
