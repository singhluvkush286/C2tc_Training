package com.tns.inheritance;
//Base Class
public class Citizen {
	private String name;
	private long aadhar;
	private String address;
	private long phone;
	public Citizen(String name, long aadhar, String address, long phone) {
		super();
		this.name = name;
		this.aadhar = aadhar;
		this.address = address;
		this.phone = phone;
	}
	public Citizen() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
}
