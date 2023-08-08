package com.Constructor;

import java.util.*;

public class Studentrank {

	int sid;
	String sname;
	int s1;
	int s2;
	int s3;
	double per;
	char gre;

	public Studentrank() {
		System.out.println("Coder School,NYK");

	}

	public Studentrank(int id, String name, int math, int Physics, int chemistry) {
		sid = id;
		sname = name;
		s1 = math;
		s2 = Physics;
		s3 = chemistry;
	}

	public void per() {
		per = ((s1 + s2 + s3) / 3);
		System.out.println(per);
	}

	public void gre() {
		if (per > 90) {
			System.out.println("Congratulation...!" + sname + " You got " + per + " and Your Gread A");
		} else if (per > 80 && per < 90) {
			System.out.println("Congratulation...!" + sname + " You got " + per + " and Your Gread B");
		} else if (per > 70 && per < 80) {
			System.out.println("Congratulation...!" + sname + " You got " + per + " and Your Gread C");
		} else if (per > 60 && per < 70) {
			System.out.println(sname + "You got " + per + " and Your Gread D");
		} else if (per > 50 && per < 60) {
			System.out.println(sname + "You got " + per + " and Your Gread D");
		}
	}
//	public void display() {
//		System.out.println(sname + "");
//	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Enetr Id:");
			int id = in.nextInt();
			System.out.println("Enetr Name:");
			String name = in.next();
			System.out.println("Enetr Math Marks:");
			int math = in.nextInt();
			System.out.println("Enetr Physics Marks:");
			int Physics = in.nextInt();
			System.out.println("Enetr chemistry Marks:");
			int chemistry = in.nextInt();

			Studentrank s1 = new Studentrank(id, name, math, Physics, chemistry);
			s1.per();
			s1.gre();
			System.out.println("Do you Want to Add Student? y/n");
			ch = in.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}

}
