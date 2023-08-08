package com.Oops;

public class Building {
	static String buildingName = "Ram Apartment";
	int flat_no;
	String name;

	public Building(int flat_no, String name) {

		this.flat_no = flat_no;
		this.name = name;
		this.display();
		garden_area();
		

	}

	static void garden_area() {
		String gar = "Garden Area";
		System.out.println(gar);
	}

	public void display() {
		System.out.println("Building Name : " + buildingName + " Flat No.: " + flat_no + " Name : " + name);
	}

	public static void main(String[] args) {
       Building b1 = new Building(101, "Ram Pawar");
       }
}
