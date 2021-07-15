package com.emmil.threads;

public class ThreadInterface implements Runnable{

	public void run() { //Makes the thread in execution mode until it’s required plan is in progress
		System.out.println("My thread is running");
	}
	public static void main(String[] args) {
		ThreadInterface obj = new ThreadInterface();
		Thread tobj = new Thread(obj);
		tobj.start();//Activate the thread 

	}

}
