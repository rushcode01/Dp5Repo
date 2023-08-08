package com.oopsBasic;

import java.util.*;

public class Student {

	int sid;
	String sname;
	String sgender;
	int snumber;

	public void studDetails(int id, String name, String gender, int number) {
		sid = id;
		sname = name;
		sgender = gender;
		snumber = number;
	}

	public void display() {
		System.out.println(
				"Student id: " + sid + " Student Name: " + sname + " Gender: " + sgender + " Number: " + snumber);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(int i= 1;i<=2;i++) {
		System.out.println("Enter id: ");
		int id = in.nextInt();
		System.out.println("Enter Name: ");
		String sname = in.next();
		System.out.println("Enter Gender: ");
		String sgender = in.next();
		System.out.println("Enter Number: ");
		int number = in.nextInt();
		
		Student s1 = new Student();
		s1.studDetails(id, sname, sgender, number);
		s1.display();
		
		}
	}
}
