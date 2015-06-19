package com.test;

import org.springframework.roo.addon.layers.service.RooService;

@RooService(domainTypes = { com.test.ServiceImpl.class })
public interface Service {

	public abstract String getText();
}
