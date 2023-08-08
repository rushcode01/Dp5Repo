//1.	Write a program to create a interface  named shape. In this class we have three
//sub classes circle, triangle and square each class has two member function named
//draw () and erase (). Create these using polymorphism concepts.

package com.interfaceAssignment;

interface Shape {
	public void draw();

	public void erase();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Circle Draw");
	}

	public void erase() {
		System.out.println("Circle Erase");
	}
}

class Triangle implements Shape {
	public void draw() {
		System.out.println("Triangle Draw");
	}

	public void erase() {
		System.out.println("Triangle Erase");
	}
}

class Square implements Shape {
	public void draw() {
		System.out.println("Square Draw");
	}

	public void erase() {
		System.out.println("Square Erase");
	}
}

public class ShapeInfo {
	public static void main(String[] args) {
		Shape s;
		s = new Circle();
		s.draw();
		s.erase();
		s = new Triangle();
		s.draw();
		s.erase();
		s = new Square();
		s.draw();
		s.erase();
	}
}
