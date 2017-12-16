package com.jnmd.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value("王五")
	private String name;
	
	@Value("110")
	private String phone;
	
	@Resource(name="add")
	private Address address;

	public Person() {
		super();
	}

	public Person(String name, String phone, Address address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	@PostConstruct
	public void init(){
		System.out.println("init...");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy...");
	}

}
