package com.tns.defaultConstructor;

public class Cal {
	public int sales(Commission c) {
		int com;
		if(c.getSalesAmount() >= 100000) {
			com=10;	
		}
		else if(c.getSalesAmount() <= 50000 && c.getSalesAmount()==10000) {
			com=5;
		}
		else if(c.getSalesAmount() < 50000) {
			com=3;
		}
		else {
			com=0;
		}
		return com;
	}

}
