package com.jnmd.spring.di;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component("u")
public class User {

	private int id;
	private String name;
	private String[] strArrs;
	private List<String> list;
	private Set<String> sets;
	private Set<Person> persons;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String[] strArrs, List<String> list, Set<String> sets, Set<Person> persons) {
		super();
		this.id = id;
		this.name = name;
		this.strArrs = strArrs;
		this.list = list;
		this.sets = sets;
		this.persons = persons;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getStrArrs() {
		return strArrs;
	}

	public void setStrArrs(String[] strArrs) {
		this.strArrs = strArrs;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", strArrs=" + Arrays.toString(strArrs) + ", list=" + list
				+ ", sets=" + sets + ", persons=" + persons + "]";
	}

}
