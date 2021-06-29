package com.emmil;

public class Dog {

	String name;
	int age;
	double weight;

	public Dog(String name, int age, double weight) {

		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {

		return String.format(name + "\n" + age + " years old" + "\n" + weight + "lb");
	}

	public void showExcitement() {

		System.out.println(name + " is walking!!");
	}

}