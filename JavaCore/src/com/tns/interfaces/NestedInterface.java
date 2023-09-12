package com.tns.interfaces;

public class NestedInterface implements MyInterface.MyInnerInterface{
	@Override
	public void print() {
		System.out.println("This is Inner Interface");
	}

}
