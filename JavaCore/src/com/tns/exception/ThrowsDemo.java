package com.tns.exception;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Throws th = new Throws();
    try {
		th.display();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Exception Founnd " +e.getMessage());
	}
	}

}
