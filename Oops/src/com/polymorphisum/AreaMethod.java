package com.polymorphisum;

public class AreaMethod {

	public void area(double pi, float r) {

		System.out.println("Area of circle: " + (pi * r * r));
	}

	public void area(float l, float b) {
		System.out.println("Area of Rectangle: " + (l * b));

	}

	public void area(float h, double b) {
		System.out.println("Area of Traingle: " + (0.5 * h * b));

	}

	public void area(float a) {
		System.out.println("Area of Square: " + (a * a));
	}

	public static void main(String[] args) {

		AreaMethod a = new AreaMethod();
		a.area(3.14,4.5f);
		a.area(4f);
		a.area(3.5f,2.5);
		a.area(4.5f, 5.4f);
	}
}
