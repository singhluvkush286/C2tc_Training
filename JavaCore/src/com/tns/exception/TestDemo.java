package com.tns.exception;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the role number");
		int rollNo=sc.nextInt();
		if(rollNo<0)
		{
			throw new ArithmeticException("roll no can't be negative");
		}
		else {
			System.out.println("Valid Roll Number");
		}
	}
}
