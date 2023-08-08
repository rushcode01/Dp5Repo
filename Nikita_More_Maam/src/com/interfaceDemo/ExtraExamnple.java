package com.interfaceDemo;
interface Cal{
	void m1();
	void m2();
	void m3();
}

abstract class Basic implements Cal{
	 public void m3() {
		System.out.println("m3 method");
	}
}

class SciCal extends Basic{
	public void m1() {
		System.out.println("m1 method");
	}
	public void m2() {
		System.out.println("m2 method ");
	}
}
public class ExtraExamnple {
public static void main(String[] args) {
	
	Basic b = new SciCal() ;
	b.m1();
	b.m2();
	b.m3();
}
}
