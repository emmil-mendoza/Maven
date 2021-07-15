package com.emmil.threads;

public class ThreadClass extends Thread { // inherits methods from Thread class

	/*
	 * wait() tells the calling thread to give up the monitor and go to sleep until
	 * some other thread enters the same monitor and calls notify(). notify() wakes
	 * up the first thread that called wait() on the same object.notifyAll() wakes
	 * up all the threads that called wait() on the same object. The highest
	 * priority thread will run first.​​
	 */

	public void run() {

		System.out.println("The thread is running");
	}

	public static void main(String[] args) {

		ThreadClass obj = new ThreadClass();
		ThreadClass obj1 = new ThreadClass();

		obj.setName("Emmil"); // give thread a name

		obj.setPriority(2);
		obj1.setPriority(9);

		System.out.println("Before Sleeping");

		try {

			Thread.sleep(500); // makes the currently executing thread to pause it’s execution for a specified
								// period of time
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("After Sleeping");
		System.out.println(obj.getName());// return name of thread
		obj.start();

		try {
			obj.join();
		} catch (InterruptedException e) {
		}
		obj1.start();
		System.out.println(obj.isAlive());
	}

}
