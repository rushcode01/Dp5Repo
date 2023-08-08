//Create a base class Building that stores the number of floors of a building, number of rooms
//and it’s total footage. Create a derived class House that inherits Building and also stores 
//the number of bedrooms and bathrooms. Demonstrate the working of the classes. create a
//second derived class Office that inherits Building and stores the number of telephones and
//tables. Now demonstrate the working of all three classes

package com.oopsAssignment;

class Building {
	int no_of_floors;
	int no_of_rooms;

	public Building(int no_of_floors, int no_of_rooms) {
		this.no_of_floors = no_of_floors;
		this.no_of_rooms = no_of_rooms;
	}

	public String toString() {
		return "No. of Floors\t: " + no_of_floors + "\nNo. of Rooms\t: " + no_of_rooms;
	}
}

class House extends Building {
	int no_of_bedroom;
	int no_of_bathrooms;

	public House(int no_of_floors, int no_of_rooms, int no_of_bedroom, int no_of_bathrooms) {
		super(no_of_floors, no_of_rooms);
		this.no_of_bedroom = no_of_bedroom;
		this.no_of_bathrooms = no_of_bathrooms;
	}

	public String toString() {
		return "Floor no.\t: " + no_of_floors + "\nNo. of Rooms\t: " + no_of_rooms + "\nNo. of Bedrooms\t: "
				+ no_of_bedroom + "\nNo. of Rooms\t: " + no_of_bathrooms;
	}
}

class Office extends Building {
	int no_of_telephones;
	int no_of_table;

	public Office(int no_of_floors, int no_of_rooms, int no_of_telephones, int no_of_table) {
		super(no_of_floors, no_of_rooms);
		this.no_of_telephones = no_of_telephones;
		this.no_of_table = no_of_table;
	}

	public String toString() {
		return "Floor No.\t: " + no_of_floors + "\nNo. of Rooms\t: " + no_of_rooms + "\nNo. of Telephone: "
				+ no_of_telephones + "\nNo. of Table\t: " + no_of_table;
	}
}

public class Buildininfo {
	public static void main(String[] args) {
		System.out.println("******SHRI RAM HEIGHTS******");
		Building b1 = new Building(12, 4);
		System.out.println(b1);
		System.out.println("---------------------");
		House h1 = new House(8, 3, 2, 2);
		System.out.println(h1);
		System.out.println("---------------------");
		Office f1 = new Office(3, 04, 17, 15);
		System.out.println(f1);
	}

}
