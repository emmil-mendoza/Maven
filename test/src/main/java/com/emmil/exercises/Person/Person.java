package com.emmil.exercises.Person;

public class Person {

	private String name;
	private int age;
	private int shoeSize;

	public Person() {
		setName("Emmil");
		setAge(23);
		setShoeSize(11);
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int newShoeSize) {
		this.shoeSize = newShoeSize;
	}

	public void walking() {
		System.out.println(name + "\n" + age + "\n" + shoeSize);
	}

	public void startWalking() {
		walking();
	}
}
