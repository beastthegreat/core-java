import java.util.Scanner;

public class Account {
	int id;
	String name;
	Double balance;
	Dateof openingDate;
	String address;
	
	Account()
	{
		
		openingDate=new Dateof();
	}
	Account(int id, String name,Double balance, Dateof openingDate,String Address)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
		this.openingDate=openingDate;
		this.address=Address;
		
			}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Dateof getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(Dateof openingDate) {
		this.openingDate = openingDate;
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
	System.out.println("id");
	this.id=sc.nextInt();
	System.out.println("name");
	this.name=sc.next();
	System.out.println("balance");
	this.balance=sc.nextDouble();
	System.out.println("Date");
	openingDate.setDd(sc.nextInt());
	openingDate.setMm(sc.nextInt());
	openingDate.setYy(sc.nextInt());
	System.out.println("Address");
	this.address=sc.next();
		
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(balance);
		System.out.println("Date:"+openingDate.dd+"/"+openingDate.mm+"/"+openingDate.yy);
		System.out.println(address);
		
		
	}
	public void withdraw()
	
	{
		System.out.println("Enter the withdrawl amount");
		Scanner sc= new Scanner(System.in);
	Double amt=sc.nextDouble();
		this.balance=this.balance-amt;
		
		System.out.println("balance:   "+this.balance);
	
	}
	
	
public static void main(String[] args)
{
	Account abc=new Account(63,"pushkar",100000.00,new Dateof(10, 10, 10),"Aundh gaon");
	abc.display();
	abc.withdraw();
	Account hello= new Account();
	hello.accept();
	hello.display();
}

}

