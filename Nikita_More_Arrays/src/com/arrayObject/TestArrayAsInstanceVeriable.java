package com.arrayObject;

public class TestArrayAsInstanceVeriable {
	public static void main(String[] args) {

		Student1 s1 = new Student1(101, "Ram", new double[] { 45, 76, 98 });

		double m1[] = { 23, 56, 89 };
		double m2[] = { 67, 43, 98 };
		double m3[] = { 45, 87, 87 };
		double m4[] = { 43, 78, 90 };

		Student1 s2 = new Student1(102, "Sham", m1);
		Student1 s3 = new Student1(103, "Manoj", m2);
		Student1 s4 = new Student1(104, "Suyog", m3);
		Student1 s5 = new Student1(106, "Shree", m4);

		System.out.println("------studen1--------");
		s2.dispaly();
		System.out.println("------studen2--------");
		s3.dispaly();

		System.out.println("------studen1 by toString()--------");
		System.out.println(s1);
		System.out.println("------studen2 by toString()--------");
		System.out.println(s2);
		System.out.println("------studen3 by toString()--------");
		System.out.println(s3);
		System.out.println("------studen4 by toString()--------");
		System.out.println(s4);
		System.out.println("------studen5 by toString()--------");
		System.out.println(s5);

	}
}
