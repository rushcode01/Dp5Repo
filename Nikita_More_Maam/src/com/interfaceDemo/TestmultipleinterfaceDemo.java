package com.interfaceDemo;
interface intA{
	void m1();
	
}
interface intB{
	void m2();
	
}

class SimpleChild implements intA,intB{
	public void m1() {
		System.out.println("m1 method from intA");
	}
	public void m2() {
		System.out.println("m1 method from intB");
	}
}
public class TestmultipleinterfaceDemo {
public static void main(String[] args) {
	SimpleChild c1 = new SimpleChild();
	c1.m1();
	c1
	.m2();
}
}
