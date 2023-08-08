//3)WAP to create class Vehicle with methods accelerate(long mph) with long 
//type parameter ,stop(),run() all method return string type of value. 
//Create class car which extends Vehicle implement accelerate(long mph)differently in car class

package com.overrriding;

class Vehicle {
	long mph;

	public void accelerate(long mph) {
		this.mph = mph;
	}

	public void stop() {
		System.out.println("Stop");
	}

	public void run() {
		System.out.println("run");

	}

	public String toString() {
		return " " + mph;
	}
}

class Car extends Vehicle {
	public void accelerate(long mph) {
		this.mph = mph;
	}
}

public class VehicleInfo {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.accelerate(200);
		System.out.println(c1);
	}
}
