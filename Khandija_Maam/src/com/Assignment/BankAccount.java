package com.Assignment;

import java.util.*;

public class BankAccount {

	int Accno;
	String name;
	double credit;
	double withdraw;
	int choice;
	static double balance = 1000;

	public BankAccount(int Accno, String name, double credit, double withdraw, double balance) {
		this.Accno = Accno;
		this.name = name;
		this.credit = credit;
		this.withdraw = withdraw;
	}

	public void deposit() {
		Scanner in = new Scanner(System.in);
		display();
		System.out.println("Enter Deposit Amount:");
		credit = in.nextDouble();
		balance = balance + credit;
		System.out.println("Successfully Deposit " + credit + "rs. ");

	}

	public void withdraw() {
		Scanner in = new Scanner(System.in);
		display();
		System.out.println("Enter Withdraw Amount:");
		withdraw = in.nextDouble();
		if (withdraw < balance) {
			balance = balance - withdraw;
			System.out.println("Successfully Withdraw " + withdraw + "rs.");
		} else {
			System.err.println("Oops,Insufficint Balance..");
		}
	}

	public void check_balance() {
		display();
		System.out.println(name + " Your Balance is " + balance + "rs.");

	}
	
	public void display() {
		System.out.println("Welcome to Bank of Coder...");
		System.out.println("Account N0.: " + Accno + "\nCustomer Name: " + name );
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char ch;
		System.out.println("Enter Account Number :");
		int Accno = in.nextInt();
		System.out.println("Enter Name :");
		String name = in.next();
		do {
			System.out.println("1.Deposit \n2.Withdraw \n3.Check Balance \n4.Exit");
			System.out.println("Enter Choice : ");
			int choice = in.nextInt();

			BankAccount c1 = new BankAccount(Accno, name, 0, 0, 0);
		    switch(choice) {
		    case 1:
		    	c1.deposit();
		    	break;
		    case 2:
		    	c1.withdraw();
		    	break;
		    case 3:
		    	c1.check_balance();
		    	break;
		    case 4:
		    	System.exit(0);
		    	break;
		    }

			System.out.println("Do you want to do Transaction? y/n");
			ch = in.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}
}
