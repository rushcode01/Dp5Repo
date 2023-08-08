//Create a class ‘rectangle’ that contains ‘length’ and ‘width’ as data members.
//From this class derive a class named ‘box’ that has additional data member ‘depth’. 
//The members of the class ‘rectangle’ should consists of a constructor and a method area(). 
//The ‘box’ should have a constructor. Write a program to implement this.
package com.inharitanceAssignment;

class Rectangle {
	float length;
	float width;

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	float area;

	public void area(float length, float width) {
		area = (length * width);
	}
}

class Box extends Rectangle {
	float depth;

	public Box(float length, float width, float depth) {
		super(length, width);
		this.depth = depth;
	}
//	public String toSTring() {
//		return " " + area;
//	}
}

public class Shapeinfo {
	public static void main(String[] args) {
		Box b1 = new Box(3.2f, 4.5f, 6.5f);
		b1.area(03.2f, 04.5f);
		System.out.println("Area of Rectangle: " + b1.area);
	}
}
