package com.arrayObject;

import java.util.Scanner;

public class StudentTestByGetterAndSetter2 {

	static Scanner in = new Scanner(System.in);

	public static void addStudents(Student s) {

		System.out.println("Enter Student details");

		System.out.println("Enter Roll no: ");
		s.setRollno(in.nextInt());

		System.out.println("Enter Name: ");
		s.setName(in.next());

		System.out.println("Enter Marks: ");
		s.setMarks(in.nextDouble());
	}

	public static void showStudent(Student sarr[]) {
		for (Student s : sarr) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Student str[] = new Student[3];
		int i, len = str.length;
		for (i = 0; i < len; i++) { 
			str[i] = new Student();
			addStudents(str[i]);
		}
		showStudent(str);
	}
}
