package com.tns.defaultConstructor;

public class Commission {
	private String name;
	private String address;
	private int phone;
	private long salesAmount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public long getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(long salesAmount) {
		this.salesAmount = salesAmount;
	}
	public Commission(String name, String address, int phone, long salesAmount) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.salesAmount = salesAmount;
	}
	@Override
	public String toString() {
		return "Commission [name=" + name + ", address=" + address + ", phone=" + phone + ", salesAmount=" + salesAmount
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ ", getSalesAmount()=" + getSalesAmount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
