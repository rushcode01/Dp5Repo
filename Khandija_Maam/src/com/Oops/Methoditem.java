package com.Oops;

public class Methoditem {

	int iid;
	String iname;
	double iprice;

	public void items(int id, String name, double price) {
		iid = id;
		iname = name;
		iprice = price;
	}

	public void display() {
		System.out.println("id:" + iid + "\nname: " + iname + "\nprice:" + iprice);
	}

	public static void main(String[] args) {

		Methoditem i1 = new Methoditem();
		i1.items(1, "Pen", 10);
		i1.display();
	}

}
