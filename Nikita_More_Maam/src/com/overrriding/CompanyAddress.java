//2) WAP to create class company with method address. create class eBay which extends
//company implement address() differently in eBay class.Here the method address ()has
//been overridden in child class.
package com.overrriding;

class Company {
	String address;

	public void address(String address) {
		this.address = address;
	}

	public String toString() {
		return " " + address;
	}
}

class eBay extends Company {
	public void address(String address) {

		this.address = address;
	}
}

public class CompanyAddress {
	public static void main(String[] args) {
		eBay a1 = new eBay();
		a1.address("Street 2, NYC");
		System.out.println(a1);
	}
}
