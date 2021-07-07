package com.emmil.oop.dog;

public class DogTest {

	public static void main(String[] args) {

		Dog d1 = new Dog("Sasha", 15, 13.65);
		Dog d2 = new Dog("Fifi", 2, 3.75);

		System.out.println(d1);
		d1.showExcitement();
		System.out.println("\n");
		System.out.println(d2);
		d2.showExcitement();
	}

}
