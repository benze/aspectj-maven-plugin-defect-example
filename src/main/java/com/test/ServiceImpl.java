package com.test;

import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {
	
	@Override
	public String getText(){
		return this.getClass().getCanonicalName() + " text: " + this.hashCode();
	}
}
