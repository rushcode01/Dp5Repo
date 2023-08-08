package com.oopsBasic;

import java.util.*;

public class SuperMart {
	int mid;
	String mname;
	double mprice;
	int mquantity;

	public void products(int id, String name, double price, int qua) {
		mid = id;
		mname = name;
		mprice = price;
		mquantity = qua;
	}

	double totalprice;
	public void totalprice() {
		    totalprice = mprice * mquantity;
	}
	
	public void bill() {
		if (mquantity > 0) {
			System.out.println("You Bill is: " + totalprice);
		} else {
			System.err.println("You buy Something..");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter product id:");
		int id = in.nextInt();
		System.out.println("Enter product Name:");
		String name = in.next();
		System.out.println("Enter product Price:");
		double price = in.nextDouble();
		System.out.println("Enter product Quantity:");
		int qua = in.nextInt();

		SuperMart p1 = new SuperMart();
		p1.products(id, name, price, qua);
		p1.totalprice();
		p1.bill();
	}
}
