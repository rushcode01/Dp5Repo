package com.abstract_class_and_Interface;

interface A {
	void myMethod();
}

class B {
	public void myMethod() {
		System.out.println("My Method");
	}
}

class C extends B implements A {
}

public class Problrm_3 {

	public static void main(String[] args) {
		A a = new C();
		a.myMethod();
	}
}
