package com.emmil;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] infoArray = { "ID Number: ", "Student Name: ", "Date Of Birth: ", "Grade Level: " };
		System.out.println("Please provide information below.");
		System.out.println(infoArray[0] + "\n" + infoArray[1] + "\n" + infoArray[2] + "\n" + "i.e 02/06/1981\n" + infoArray[3]);

		Student s1 = new Student();
		int a = sc.nextInt();
		sc.nextLine(); // add this
		String b = sc.nextLine();
		String c = sc.nextLine();
		int d = sc.nextInt();
		s1.setId_number(a);
		s1.setStudent_name(b);
		s1.setDob(c);
		s1.setGrade_level(d);

		System.out.println(infoArray[0] + s1.getId_number() + "\n" + infoArray[1] + s1.getStudent_name());
		System.out.println(infoArray[2] + s1.getDob() + "\n" + infoArray[3] + s1.getGrade_level());

	}

}
