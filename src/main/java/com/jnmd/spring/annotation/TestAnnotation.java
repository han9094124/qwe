package com.jnmd.spring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jnmd.spring.di.User;

public class TestAnnotation {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("/annotation.xml");
		/*Address address = context.getBean("address", Address.class);
		System.out.println(address);*/
		
		Person p = context.getBean("person", Person.class);
		System.out.println(p);
		
		boolean flag = context.isSingleton("person");
		System.out.println("注解下默认为单例: " + flag);
		
		Person p2 = new Person();
		Address address = p2.getAddress();
		System.out.println(address);	// null
		
		
		User u = context.getBean("u", User.class);
		System.out.println(u);
		
		context.close();
	}

}
