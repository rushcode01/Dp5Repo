package com.arrayObject;

import java.util.Scanner;

public class StudentTestByGetterAndSetter {

	public static void main(String[] args) {

		Student str[] = new Student[3];
		int i, len = str.length;
		System.out.println("Enter Student details");
		Scanner in = new Scanner(System.in);
		for (i = 0; i < len; i++) {
			str[i] = new Student();

			System.out.println("Enter Roll no: ");
			str[i].setRollno(in.nextInt());

			System.out.println("Enter Name: ");
			str[i].setName(in.next());

			System.out.println("Enter Marks: ");
			str[i].setMarks(in.nextDouble());
		}
		System.out.println("----------------Display-----------------");

		for (Student s : str) {
			System.out.println(s);
		}
	}
}
