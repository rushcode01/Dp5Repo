package com.AccessModifier;

class Customer{
	private int accBalance;
	public String cname;
	protected String cEmail;
	String cAddress;
}
	
	
public class AccessModifier {


	protected String cEmail(){
		System.out.println(2);
		return cEmail();
	}
	
	
	public String cname(  ){
		System.out.println(1);
		return cname();
	}
	
	
	public static void main(String[] args) {
		AccessModifier a1= new AccessModifier();
		a1.cname();
		int accBalance = 2000;
		a1.cEmail ();
		
	}
	
}
