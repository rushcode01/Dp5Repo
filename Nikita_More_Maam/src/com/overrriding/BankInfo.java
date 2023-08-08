//A bank has a principal amount and a rate of interest which is 2%. A savings account has 
//a rate of interest 3% while a current account has 5%. Write a method that displays the 
//rate of interest based on whether the account is default/ savings/ current.

package com.overrriding;

class BankAccount{
	int principalAmount;
	String rateOfInterest;
    public void show(int principalAmount){
    	this.principalAmount = principalAmount;
    	this.rateOfInterest = "2%";
    	System.out.println(principalAmount + " Default rate of intres "+ rateOfInterest);
    }
}
class SavingAccount extends BankAccount{
	public void show(int principalAmount) {
		this.principalAmount = principalAmount;
    	this.rateOfInterest = "3%";
    	System.out.println(principalAmount + " Saving Account rate of intres "+ rateOfInterest);
    }
}
class CurrentAccount extends BankAccount{
	public void show(int principalAmount) {
		this.principalAmount = principalAmount;
    	this.rateOfInterest = "5%";
    	System.out.println(principalAmount + " Current Account rate of intres "+ rateOfInterest);
	}
}
public class BankInfo {
public static void main(String[] args) {
	BankAccount b1 = new BankAccount();
	b1.show(10000);
	SavingAccount s1 = new SavingAccount();
	s1.show(20000);
	CurrentAccount c1 = new CurrentAccount();
	c1.show(40000);
}
}
