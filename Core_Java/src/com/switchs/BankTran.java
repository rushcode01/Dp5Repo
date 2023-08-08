package com.switchs;

import java.util.Scanner;

public class BankTran {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please Insert Your Atm Card");
		int ent = in.nextInt();
		System.out.println("Enter your pin");
		int pin = in.nextInt();

		System.out.println("Welcome to Coder Bank..");
		System.out.println("1.Deposit \n2.Withdraw \n3.Check Balance \n4.Exit");
		System.out.println("Enter Choice:");
		int choice = in.nextInt();
		int balance = 1000;
		switch (choice) {
		case 1:
			System.out.println("Enter Deposit Amount:");
			int amount = in.nextInt();
			balance = balance + amount;
			System.out.println("Successfully Deposit" + amount + "rs. and Balance is" + balance);
			break;
		case 2:
			System.out.println("Enter Withdraw Amount:");
			int withdraw = in.nextInt();
			balance = balance - withdraw;
			System.out.println("Successfully Withdraw" + withdraw + "rs. and Balance is" + balance);
			break;
		case 3:
			System.out.println("Your Balance is" + balance + "rs.");
			break;
		case 4:
			System.exit(0);
		}
	}
}
