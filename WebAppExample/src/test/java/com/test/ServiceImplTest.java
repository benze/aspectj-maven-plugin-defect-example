package com.test;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:META-INF/spring/applicationContext*.xml")
public class ServiceImplTest {
	
	@Autowired
	private Service service;

	@Test
	public void untouched() {
		System.out.println( service.getText());
		Assert.assertTrue(service.getText().contains("ServiceImpl") );
	}

	@Test
	public void mangled() {
		System.out.println( service.getText());
		Assert.assertFalse(service.getText().contains("ServiceImpl") );
	}
	
}
