
package com.Encapsulation;

public class Customer {

	private int c_id;
	private String c_name;
	private int balance=20000;
	
	
	public void setc_id(int c_id) {
		this.c_id=c_id;
	}
	public void setc_name(String c_name) {
		this.c_name= c_name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getc_id() {
		return c_id;
	}
	public String getc_name() {
		return c_name;
	}
	public int getBalance() {
		return balance;
	}
	public void tran(int withdraw) {
		System.out.println("Your Balance is "+(this.balance -  withdraw));
		
	}
	
}
