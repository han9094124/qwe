package com.jnmd.spring.annnotest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		/*AddLeagueAction action = new AddLeagueAction();
		String str = action.execute();*/
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("/annotation_test.xml");
		AddLeagueAction action = context.getBean("addLeagueAction", AddLeagueAction.class);
		String str = action.execute();
		System.out.println(str);

	}

}
