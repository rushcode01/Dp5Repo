package com.overrriding;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}

}

class Circle extends Shape {
//	public void draw() {
//		System.out.println("circle");
//	}
	public void display() {

	}

}

class Square extends Shape {
	public void draw() {
		System.out.println("square");
	}

}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Rectangle");
	}

}

//class MyCircle extends circle {
//	
//}
public class ShapeInfo {
	public static void main(String[] args) {
		Shape s1 = new Shape();
//		s1.display();
//		MyCircle c1 = new MyCircle();

	}

}
