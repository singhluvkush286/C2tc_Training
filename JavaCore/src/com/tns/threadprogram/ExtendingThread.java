package com.tns.threadprogram;

//Creating the thread by extending the thread class
public class ExtendingThread extends Thread{
	public void run() {
		System.out.println("Running Stage");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingThread th = new ExtendingThread();//new state
		th.start(); // runnable state
	}

}
