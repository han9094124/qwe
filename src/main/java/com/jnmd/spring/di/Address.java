package com.jnmd.spring.di;

public class Address {

	private String home;
	private String offi;
	private int code;

	public Address() {
		super();
	}

	public Address(String home, String offi, int code) {
		super();
		System.out.println("Constractor Address");
		this.home = home;
		this.offi = offi;
		this.code = code;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getOffi() {
		return offi;
	}

	public void setOffi(String offi) {
		this.offi = offi;
	}

	@Override
	public String toString() {
		return "Address [home=" + home + ", offi=" + offi + ", code=" + code + "]";
	}


}
