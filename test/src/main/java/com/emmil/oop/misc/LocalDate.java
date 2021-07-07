package com.emmil.oop.misc;

import java.util.Scanner;

public class LocalDate {

	private int day;
	private int month;
	private int year;
	
	public LocalDate () {
		setDay(day);
		setMonth(month);
		setYear(year);
		
	}
	
	

	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}

	public void printLocalDate () {
		
		System.out.println("");
	}


	public void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		LocalDate date = new LocalDate();
		date.setMonth(a); date.setDay(b); date.setYear(c);
		
		

	}

}
