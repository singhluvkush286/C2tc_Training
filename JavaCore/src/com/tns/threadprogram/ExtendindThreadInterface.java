package com.tns.threadprogram;

public class ExtendindThreadInterface implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Stage");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendindThreadInterface th = new ExtendindThreadInterface();//new state
		Thread t1 = new Thread(th);
	    t1.start();// runnable state
	}

}
