//6.	Create an interface Account having methods- deposit(), withdraw() and aboutBank()
//(abountBank() is a static method). Create two classes Saving and Current which implement 
//the Account interface. Call the methods of Saving and Current classes in main method.,
//create a new method in Account interface- takeLoan() (takeLoan() is a default method).
//takeLoan() method would be implemented by Saving class only. Call the methods of Saving
//and Current classes in main method.
package com.interfaceAssignment;

interface Account {
	public void deposit();

	public void withdraw();

	public static void aboutBank() {
		System.out.println("Coder Bank Pvt. Ltd.");
	}

	default void takeLoan() {
		System.out.println("Take Laon");
	}
}

class CurrentAccount implements Account {

	@Override
	public void deposit() {
		System.out.println("Deposit Amount");
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw Amount");
	}
}

class SavingAccount implements Account {
	@Override
	public void deposit() {
		System.out.println("Deposit Amount");

	}

	@Override
	public void withdraw() {
		System.out.println("withdraw Amount");

	}

	@Override
	public void takeLoan() {

		Account.super.takeLoan();
	}
}

public class BankInfo {
	public static void main(String[] args) {

		SavingAccount s = new SavingAccount();
        Account.aboutBank();
		System.out.println("Saving Account:");
		s.deposit();
		s.withdraw();
		s.takeLoan();
		System.out.println("--------------------");
		CurrentAccount c = new CurrentAccount();
		System.out.println("Current Account:");
		c.deposit();
		c.withdraw();

	}
}
