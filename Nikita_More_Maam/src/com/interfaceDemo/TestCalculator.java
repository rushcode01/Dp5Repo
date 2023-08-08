package com.interfaceDemo;

interface Calculator {
	public int add(int a, int b);

	public int sub(int a, int b);

	public int mul(int a, int b);

	public int div(int a, int b);

	private void data() {
		System.out.println("method in interface");
	}

	static void shareData() {
		System.out.println("Static method in intherface");
	}

	default void display() {
		System.out.println("This default method");
	}

	default void m1() {
		System.out.println("facewbook");
	}

	default void m2() {
		data();
		System.out.println("amazon");
	}

	default void m3() {
		data();
		System.out.println("flipkart");
	}
}

class BasicCal implements Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}
}

public class TestCalculator {
	public static void main(String[] args) {
		BasicCal b1 = new BasicCal();
		System.out.println("Add: " + b1.add(12, 3));
		System.out.println("Sub: " + b1.sub(12, 3));
		System.out.println("Mul: " + b1.mul(12, 3));
		System.out.println("Div: " + b1.div(12, 3));
	     
		b1.m1();
		b1.m2();
		b1.m3();
		Calculator.shareData();
		
	
	}
}
