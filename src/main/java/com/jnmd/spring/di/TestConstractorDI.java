package com.jnmd.spring.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstractorDI {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("/constractor_di.xml");
		Address address = context.getBean("address", Address.class);
		System.out.println(address);
	}

}
