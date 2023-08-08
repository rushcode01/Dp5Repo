package com.arrayObject;

import java.util.Arrays;

public class Student1 {

	private int rollno;
	private String name;
	private double marks[];

	Student1() {
	}

	Student1(int rollno, String name, double marks[]) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public void dispaly() {
		System.out.println("Roll no: " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Marks : " + Arrays.toString(marks));
	}

	@Override
	public String toString() {
		return "Student1 Rollno\t: " + rollno + "\nName\t\t: " + name + "\nMarks\t\t: " + Arrays.toString(marks);
	}
	
}
