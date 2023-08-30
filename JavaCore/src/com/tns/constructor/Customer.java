package com.tns.constructor;


//Program to demonstrate constructor
public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	
	
	public Customer() {
		System.out.println("default Constructor");
	}
	


	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + ", getCustomerName()=" + getCustomerName() + ", getCustomerId()=" + getCustomerId()
				+ ", getCustomerCity()=" + getCustomerCity() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

}
