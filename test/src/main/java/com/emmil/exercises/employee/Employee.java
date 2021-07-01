package com.emmil.exercises.employee;

public class Employee {

	private double monthlySalary;
	private String firstName;
	private String lastName;

	public Employee() {
		setMonthlySalary(2000.55);
		setFirstName("John");
		setLastName("Doe");

	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double yearlySalary(double y) {
		y = monthlySalary * 12;
		return y;
	}

	public double yearlySalaryRaise(double totalAmount) {
		totalAmount = (monthlySalary * 12) + (monthlySalary * 12 * 0.1);
		return totalAmount;
	}

}
