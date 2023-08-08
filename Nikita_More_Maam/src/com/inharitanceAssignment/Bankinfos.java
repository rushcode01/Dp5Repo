//Create class Bank(super)having getInterest() method returning interest .
//create any three child classes like sbi,icici,axis and override method in 
//respective class

package com.inharitanceAssignment;

class Bank {
	public void getIntrest(String interest) {
     System.out.println("rate of interest : " + interest);
	}
}

class Sbi extends Bank {
	public void getIntrest(String interest) {
      System.out.println("SBI rate of intrest : " + interest);
	}
}
class Icici extends Bank {
	public void getIntrest(String interest) {
	      System.out.println("Icici rate of intrest : " + interest);
	}
}
class Axis extends Bank {
	public void getIntrest(String interest) {
	      System.out.println("Axis rate of intrest : " + interest);
	}
}

public class Bankinfos {
	public static void main(String[] args) {
		
    Sbi s1 =new Sbi();
    s1.getIntrest("3%");
    Icici I1 =new Icici();
    I1.getIntrest("2.8%");
    Axis a1 =new Axis();
    a1.getIntrest("2.7%");
  
	}
}
