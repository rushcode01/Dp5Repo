package com.arraysBasic;

import java.util.*;


class Student {
	int rollNo;
	String name;
	int marks[];

	Student(int rollno, String name, int marks[]) {
		this.rollNo = rollno;
		this.name = name;
		this.marks = marks;
	}

	public static int sum(int marks[]) {
		int i, sum = 0, len = marks.length;
		for (i = 0; i < len; i++) {
			sum += marks[i];
		}
		return sum;

	}

	@Override
	public String toString() {
		return "Student RollNo = " + rollNo + "\nName = " + name + "\nMarks = " + Arrays.toString(marks)
				+ "\ntotal Marks = " + sum(marks);
	}

}

public class ArrayInstantVeraiable {

	public static void main(String[] args) {
		int m1[] = { 43, 56, 78, 98, 89 };
		int m2[] = { 78, 98, 89, 43, 56, };
		int m3[] = { 43, 89, 56, 78, 98 };
		Student s1 = new Student(101, "RAM", m1);
		sum(m2);
		Student s2 = new Student(102, "SHAM", m2);
		sum(m2);
		Student s3 = new Student(103, "SUNIL", m3);
		sum(m3);
		System.out.println(s1);
		System.out.println("=============================");
		System.out.println(s2);
		System.out.println("=============================");
		System.out.println(s3);
	}

	private static void sum(int[] m1) {
		// TODO Auto-generated method stub

	}
}
