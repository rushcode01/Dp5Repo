//Write a program to create a class named Vehicle having protected instance variables
//regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle
//class”. Inherit the Vehicle class into subclasses named Bus and Car having individual 
//private instance variables routeNumber in Bus and manufacturerName in Car and both of them
//having showData ( ) method showing all 

package com.oopsAssignment;

class Vehicle {
	protected int regnNumber;
	protected int speed;
	protected String color;
	protected String ownerName;

	public Vehicle(int regnNumber, int speed, String color, String ownerName) {
		this.regnNumber = regnNumber;
		this.speed = speed;
		this.color = color;
		this.ownerName = ownerName;
	}

	public void showData() {
		System.out.println("This is a vehicle class");
	}
}

class Bus extends Vehicle {
	protected int routeNumber;

	public Bus(int regnNumber, int speed, String color, String ownerName, int routeNumber) {
		super(regnNumber, speed, color, ownerName);
		this.routeNumber = routeNumber;
	}

	public void showData() {
		System.out.println("Regn Number\t: " + regnNumber + "\nSpeed\t: " + speed + "\nColor\t: " + color
				+ "\nOwner Name\t: " + ownerName + "\nRoute Number\t: " + routeNumber);
	}
}

class Car extends Vehicle {
	protected String manufacturerName;

	public Car(int regnNumber, int speed, String color, String ownerName, String manufacturerName) {
		super(regnNumber, speed, color, ownerName);
		this.manufacturerName = manufacturerName;
	}

	public void showData() {
		System.out.println("Regn Number\t: " + regnNumber + "\nSpeed\t: " + speed + "\nColor\t: " + color
				+ "\nOwner Name\t: " + ownerName + "\nManufacturer Name\t: " + manufacturerName);
	}
}

public class Vehicleinfo {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(0, 0, null, null);
		v1.showData();
		System.out.println("---------------------");
		Bus b1 = new Bus(7612, 120, "red", "Ram Kumar", 87625);
		b1.showData();
		System.out.println("---------------------");
		Car c1 = new Car(3422, 140, "Black", "Sham Kumar", "Mastang");
		c1.showData();

	}

}
