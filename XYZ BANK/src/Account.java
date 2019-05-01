import java.util.Scanner;

public class Account {

	Long accnumber;
	String name;
	Long contact;
	String address;
	String pan;
	String email;
	Account(){}
	Account(Long accnumber, String name, Long contact,String address, String email, String pan){
		this.accnumber=accnumber;
		this.name=name;
		this.contact=contact;
		this.address=address;
		this.pan=pan;
		this.email=email;
	}
	public Long getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(Long accnumber) {
		this.accnumber = accnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	void withdraw() {
	
		System.out.println("enter the withdrawl amount");
		Scanner sc=new Scanner(System.in);
		int withdraw=sc.nextInt();
	}
	void createAccount() {
		System.out.println("enter the account number");
		Scanner sc=new Scanner(System.in);
		Long accnumber=sc.nextLong();
		
		System.out.println("enter the name");
		String name=sc.next();
		
		System.out.println("enter the contact number");
		Long contact=sc.nextLong();
		
		System.out.println("enter the pan");
		String pan=sc.next();
	
		System.out.println("enter the email");
		String email=sc.next();
	
		System.out.println("enter the address");
		String address=sc.next();
	
	}
	
	
	
	
			
}
