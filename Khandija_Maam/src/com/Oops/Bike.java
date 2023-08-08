package com.Oops;

public class Bike {

	String name;
	String color;
	double price;
	int speed;
	float Avg;

	public Bike(String name, String color, double price) {
		this(120);
		this.name = name;
		this.color = color;
		this.price = price;
		this.display();
	}
	public Bike(int speed) {
		this(55.4f);
		this.speed = speed;
	}
	
	public Bike(float Avg) {
		this.Avg = Avg;
	}

	
	void display() {
		System.out.println("Bike : " + this.name + " Color: " + this.color + " Price: " + this.price + " Speed: "+ this.speed + " Avg: "+ this.Avg);
	}

	public static void main(String[] args) {

		Bike b1 = new Bike("Apache rtr 200", "Black", 200000);
//		b1.display();
	}
}
