package com.emmil.exercises.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setFirstName("Emmil");
		e1.setLastName("Mendoza");
		e1.setMonthlySalary(5000);
		Employee e2 = new Employee();
		e2.setFirstName("Kemmil");
		e2.setLastName("Mendoza");
		e2.setMonthlySalary(4000);
		double annualAmount = 0;

		System.out.println(e1.getFirstName() + "\n" + e1.getLastName() + "\n" + "Yearly Salary: " + e1.yearlySalary(annualAmount));
		System.out.println("Yearly salary after 10% raise: " + e1.yearlySalaryRaise(annualAmount));
		System.out.println("\n");
		System.out.println(e2.getFirstName() + "\n" + e2.getLastName() + "\n" + "Yearly Salary: " + e2.yearlySalary(annualAmount));
		System.out.println("Yearly salary after 10% raise: " + e2.yearlySalaryRaise(annualAmount));
	}

}
