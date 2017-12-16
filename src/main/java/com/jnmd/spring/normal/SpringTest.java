package com.jnmd.spring.normal;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// 获取Spring容器对象
		// ClassPathXmlApplicationContext: 根据指定的路径解析处理配置文件
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("/bean.xml");
		//System.out.println(context);
		
		UserService userService = (UserService)context.getBean("userServcie");
		userService.addUser();

	}

}
