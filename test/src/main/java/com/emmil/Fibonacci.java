package com.emmil;

public class Fibonacci { // Fibonacci sequence 0 1 1 2 3 5 8 13 21 34 55 89 

	static long fib(long n) {

		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {

		System.out.println("Fib. number is " + fib(5));

	}

}
