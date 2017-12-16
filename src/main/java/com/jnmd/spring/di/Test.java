package com.jnmd.spring.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("/bean.xml");
		Address address = context.getBean("address", Address.class);
		System.out.println(address);
		
		Person p = context.getBean("person", Person.class);
		System.out.println(p);
		
		// 测试单例,多例
		Person p2 = context.getBean("person", Person.class);
		System.out.println(p == p2);
		
		
		boolean flag = context.isSingleton("person");
		System.out.println("person是否单例:　" + flag);
		flag = context.isSingleton("p2");
		System.out.println("p2是否单例:　" + flag);
		
		flag = context.containsBean("userServcie");
		System.out.println("spring容器中是否包含userServcie: " + flag);
		
		flag = context.containsBean("userController");
		System.out.println("spring容器中是否包含userController: " + flag);
		
		context.close();
	}
	
}
