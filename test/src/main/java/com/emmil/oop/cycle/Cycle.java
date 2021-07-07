package com.emmil.oop.cycle;

class Cycle {

	public String bicycle() {
		return "a vehicle with pedals.";
	}
}

class Bike extends Cycle {
	public String motorcycle() {
		return "a cycle with an engine.";
	}

	Bike() {
		System.out.println("Hello I am a Bike I am " + motorcycle());
		String temp = bicycle();
		System.out.println("My ancestor is a cycle who is " + temp);
	}

}

class InheritenceExample {
	public static void main(String[] args) {
		Bike M = new Bike();

	}
}
