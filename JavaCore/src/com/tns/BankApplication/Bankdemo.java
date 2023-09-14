package com.tns.BankApplication;

public class Bankdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank ba=new Bank();
		Account acc=new Account(12345,"suma",15500,ba);
		acc.deposit(acc, 20000);
		System.out.println(acc);
		
	}
}
