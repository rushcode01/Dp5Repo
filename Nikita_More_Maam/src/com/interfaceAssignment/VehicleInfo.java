//	Create interfaces Bike and Scooty, both of which have two methods- offer() and 
//	details() (details() is default method). Create a new class BuySomething
//which implements both interfaces. To remove ambiguity, create a method details()
//in BuySomething class as well in which call the details() method of both interfaces.
//Call the methods of BuySomething class in main method.

package com.interfaceAssignment;

interface Bike {
	public void offer();

	default void details() {
		System.out.println("Bike Details");
	}
}

interface Scooty {
	public void offer();

	default void details() {
		System.out.println("Scooty Details");
	}
}

class BuySomething implements Bike, Scooty {

	@Override
	public void offer() {
		System.out.println("Vehicle Offers");
	}

	@Override
	public void details() {

		Bike.super.details();
		Scooty.super.details();
	}
}

public class VehicleInfo {
	public static void main(String[] args) {

		BuySomething b = new BuySomething();
		b.offer();
		b.details();
	}
}
