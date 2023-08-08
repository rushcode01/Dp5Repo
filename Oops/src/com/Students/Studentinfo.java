package com.Students;

import java.util.*;

public class Studentinfo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Student Id:");
		int id = in.nextInt();
		System.out.println("Enter Student Name:");
		String sname = in.next();
		System.out.println("Enter Student Per%:");
		double per = in.nextDouble();
		System.out.println("You Got Place:");
		boolean place = in.nextBoolean();

		Students s1 = new Students();
		s1.setId(id);
		s1.setSname(sname);
		s1.setPer(per);
		s1.setPlac(place);
		s1.display();

		if (place == true) {
			System.out.println("You placed..");
		} else {
			System.out.println("Your not Placed");
		}
	}
}
