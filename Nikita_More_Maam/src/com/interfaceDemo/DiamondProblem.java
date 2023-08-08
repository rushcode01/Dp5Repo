package com.interfaceDemo;

interface interfaceA {
	default void show() {
		System.out.println("Show method of interfaceA");
	}
}

interface interfaceB {
	default void show() {
		//we have invoke the method by an interface name
		//because of this there is no ambiguity error.
		System.out.println("show method of interfaceB");
	}
}

class Child implements interfaceA, interfaceB {

	public void show() {
		interfaceA.super.show();
		interfaceB.super.show();
	}
}

public class DiamondProblem {
	public static void main(String[] args) {
		Child c = new Child();
		c.show();
	}
}
