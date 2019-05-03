package denabank;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class Account2 {
	
	int accnumber;
	String name;
	Double balance;
	
	String address;
	
	
	Account2(){}
	
	public Account2(int accnumber, String name, Double balance, String address) {
		
		this.accnumber = accnumber;
		this.name = name;
		this.balance = balance;
		this.address = address;
	}

	
	
	
	public int getId() {
		return accnumber;
	}
	public void setId(int accnumber) {
		this.accnumber = accnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void accept()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("accnumber");
	this.accnumber=sc.nextInt();
	System.out.println("name");
	this.name=sc.next();
	System.out.println("balance");
	this.balance=sc.nextDouble();
	System.out.println("Address");
	this.address=sc.next();
		
	}
	
	public void display()
	{
		System.out.println(accnumber);
		System.out.println(name);
		System.out.println(balance);
		
		System.out.println(address);
		
	}
	
	public static void main(String[] args)
	{
		
		Date today = new Date();
		System.out.println(today);
		Savings s1=new Savings();
		
		Duration duration = Duration.between(first, second);
	}
}
