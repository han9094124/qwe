package com.jnmd.spring.di;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("/bean.xml");
		User user = context.getBean("user", User.class);
		System.out.println(user);
		
		Set<Person> persons = user.getPersons();
		for(Person p : persons){
			System.out.println(p);
		}
	}

}
