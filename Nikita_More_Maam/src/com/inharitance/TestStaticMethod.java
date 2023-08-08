
package com.inharitance;

class Flower{
	public static void color() {
		System.out.println("Flower: Color");
	}
}
class Rose extends Flower{
public static void color() {
		System.out.println("Color:Red");
	}
}
public class TestStaticMethod {
public static void main(String[] args) {
	Flower f = new Rose();
	f.color();// method hiding
	main("");
}

public static void main(String s) {
	System.out.println("Overloaded Method");
}
}
