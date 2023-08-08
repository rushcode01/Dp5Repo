package com.containment;

class Pen {
	String brand;
	String color;
	int price;

	public Pen(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;

	}

	public void showp() {
		System.out.println("Brand Name:" + brand + " Pen Color: " + color + " Price: " + price);
	}

	public String toString() {
		return brand + " " + color + " " + price;
	}

}

public class Bag {

	String brand_name;
	int price;
	String color;
	Pen p;

	public Bag(String brand, String color, int price, Pen p) {
		this.brand_name = brand;
		this.color = color;
		this.price = price;
		this.p = p;

	}

	public void Show() {
		System.out.println("Brand Name: " + brand_name + " Pen Color: " + color + " Price: " + price);
		p.showp();
	}

	public String toString() {
		return brand_name + " " + color + " " + price + " " + p;
	}

	public static void main(String[] args) {

//		Pen p = new Pen("Monmtex","Blue",10);
		Bag b = new Bag("Skybag", "Black", 3000, new Pen("Montex", "Blue", 10));
//        Bag b = new Bag("Skybag","Black",3000,p);
		System.out.println(b);
		b.Show();

//        System.out.println(p);

	}

}
