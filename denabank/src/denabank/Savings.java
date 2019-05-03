package denabank;

import java.util.Calendar;
import java.util.Date;

public class Savings extends Account2 {

	int years;
	
	Savings(){}
	Savings(int years){
		this.years=years;	
	}
	
	public Double interestcal() {
		if(balance<5000) {
		return((balance*years*0.4)/100);
		}
		else
		{
			return((balance*years*0.9)/100);
		}
		
		
	}
	
	
	
}
