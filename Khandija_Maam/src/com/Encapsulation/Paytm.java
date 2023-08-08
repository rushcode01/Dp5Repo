package com.Encapsulation;

import java.util.Scanner;

public class Paytm {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Customer Number:");
		int cnum = in.nextInt();
		System.out.println("Enter Customer Name:");
		String cname = in.next();

		Customer c1 = new Customer();
		c1.setc_id(cnum);
		c1.setc_name(cname);
		System.out.println("Enter Transfer Amount:");
		int trans = in.nextInt();
		c1.tran(trans);
	}
}
