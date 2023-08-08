package com.interfaceDemo;


interface Vehicle {
	void move();

}

class Car implements Vehicle {
	@Override
	public void move() {
		System.out.println("Traveling by car");
	}
}

class Bus implements Vehicle {
	@Override
	public void move() {
		System.out.println("Traveling by Bus");
	}
}

class Traverler {
	private Vehicle v;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	public void startJourney() {
		v.move();
	}
}

public class LooseCoupling {
	public static void main(String[] args) {
		Traverler t1 = new Traverler();
		t1.setV(new Car());
		t1.startJourney();

		t1.setV(new Bus());
		t1.startJourney();
	}
}
