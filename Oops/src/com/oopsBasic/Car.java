package com.oopsBasic;

public class Car {
	
	int emodelNumber;
	String ename;
	double eprice;
	
	public void carDetails(int mnum, String name, double price) {
		emodelNumber = mnum;
		ename = name;
		eprice = price;
	}
	
	public void display() {
		System.out.println("Model Number = " + emodelNumber + "\nName = "+ ename + "\nPrice = " + eprice );
	}
	
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.carDetails(1001, "Thar", 1500000);
		car1.display();
		Car car2 = new Car();
		car2.carDetails(1002, "XUV", 1400000);
		car2.display();
		Car car3 = new Car();
		car3.carDetails(1003, "Creta", 1700000);
		car3.display();
		
		
	}

}
