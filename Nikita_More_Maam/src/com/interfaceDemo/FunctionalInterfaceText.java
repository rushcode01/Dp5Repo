package com.interfaceDemo;

import java.io.Serializable;

//single abstract method in interface
@FunctionalInterface

interface Washable {
	void wash();// abstract method

	default void m1() {

	}
}

@FunctionalInterface
interface A {
	void m1();
}

//marker interface
class B implements Serializable{
	
}
public class FunctionalInterfaceText {
	public static void main(String[] args) {

	}
}
