package com.inharitanceAssignment;

class Shape {
	void draw() {
		System.out.println("Drawing");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");
	}
}

class Rectangl extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing Triangle");
	}
}

public class ShapeDynamicDispatch {
	public static void main(String[] args) {
		Shape s;
		s = new Circle();
		s.draw();
		s = new Rectangl();
		s.draw();
		s = new Triangle();
		s.draw();
	}
}
