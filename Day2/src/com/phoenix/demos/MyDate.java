package com.phoenix.demos;

public class MyDate {
	
	int day;
	int month;
	int year;
	
	
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


	public MyDate() {
		// TODO Auto-generated constructor stub
	}
	
	public MyDate(int v1, int v2, int v3)
	{
		day=v1;
		month=v2;
		year=v3;
	}

}
