package com.tns.constructor;

import java.util.Scanner;

public class ConstructorDemo {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("enter customer Id");
		id= sc.nextInt();
		sc.nextLine();
		System.out.println("enter customer name");
		name= sc.next();
		System.out.println("enter customer city");
		city= sc.next();
		Customer cl = new Customer(city, id, city);  //default constructer
		cl.setCustomerId(id);
		cl.setCustomerName(name);
		cl.setCustomerCity(city);
		System.out.println(cl);
		Customer c2 = new Customer(name,id,city);
		System.out.println(c2);
		

}
}
