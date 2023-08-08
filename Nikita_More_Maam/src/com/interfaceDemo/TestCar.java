
package com.interfaceDemo;

interface Cng_Car {
	void drive();

	void cng_car_kit();

}

interface Petrol_Car {
	void drive();

	void petrol_car_kit();

}

class Hybrid implements Cng_Car, Petrol_Car {
	public void drive() {
		System.out.println("Driving Hybrid car");
	}

	public void cng_car_kit() {
		System.out.println("CNG kit");
	}

	public void petrol_car_kit() {
		System.out.println("Petron kit");
	}
}

public class TestCar {
	public static void main(String[] args) {
		Hybrid h = new Hybrid();
		h.drive();
		h.cng_car_kit();
		h.petrol_car_kit();
	}
}
