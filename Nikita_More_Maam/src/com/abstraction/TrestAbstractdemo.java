package com.abstraction;

abstract class Mobile {
	private String modelName;
	private double price;

	public abstract void call();

	public void display() {
		System.out.println("Mobile display method");
	}
}

class Basic extends Mobile {

	public void call() {
		System.out.println("Basic mobile calling");
	}
}

abstract class Android extends Mobile {

	public abstract void call();
}

class OnePlus extends Android {
	public void call() {
		System.out.println("OnePlus Calling method");
	}
}

public class TrestAbstractdemo {
	public static void main(String[] args) {

      
		Mobile m1 = new OnePlus();
		m1.call();
	}
}
