package com.Inharitance;

class Car {
	String type = "Luxury Car";
}

class SUV extends Car {
	String seat = "4";
}

class GLA extends SUV {
	String price = " 48.50 Lakh";
}

public class Multilevel2 {
	public static void main(String[] args) {
 
		GLA g1 = new GLA();
		System.out.println(g1.type + " " + g1.seat +" "+ g1.price);
	}
}
