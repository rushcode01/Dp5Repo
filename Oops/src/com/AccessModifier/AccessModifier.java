package com.AccessModifier;

public class AccessModifier {
	private int id;
	private String ename;
	private int number;
	
	public AccessModifier(int id, String ename,int number) {
		this.id = id;
		this.ename =ename;
		this.number= number;
	}
	
	void display() {
		System.out.println(id + " " + ename + " " + number);
		
	}
}
