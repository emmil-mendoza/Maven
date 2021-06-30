
package com.emmil;

public class Date {

	private int month;
	private int day;
	private int year;

	public Date() {

		setMonth(11);
		setDay(22);
		setYear(1998);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void displayDate() {

		System.out.println(month + "/" + day + "/" + year);
	}
}
