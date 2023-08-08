package com.finalKeyWord;
//final class Employee{
//	
//}
//class Manager extends Employee{
//	//can not extends bcoz of final key word 
//}
public class FinalKey {
	final int v = 2023;
	final int num;

	static final int x;
	static {
		x = 12;
	}
	static {
		// x=52;// can not reassign
	}

	public FinalKey() {
		num = 1211;
	}

	public FinalKey(String str) {
		num = 23;
	}

	public static void main(String[] args) {

		int a = 10;
		a++;
		System.out.println(a);

		final int b;
		b = 10;
		int c = a + b;
		// b++; can not change value for final variable
		System.out.println(b);
		System.out.println(c);

		FinalKey t = new FinalKey();
		System.out.println(t.v);
		System.out.println(t.num);
	}
}
