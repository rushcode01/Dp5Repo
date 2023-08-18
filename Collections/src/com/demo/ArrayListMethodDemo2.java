package com.demo;

import java.util.ArrayList;

public class ArrayListMethodDemo2 {
	public static void main(String[] args) {
		ArrayList<String> nameList1 = new ArrayList<String>();

		nameList1.add("Ram");
		nameList1.add("Sham");
		nameList1.add("Ritik");
		nameList1.add("Krishan");
		nameList1.add("Om");
		ArrayList<String> nameList2 = new ArrayList<String>();

		nameList2.add("Ram");
		nameList2.add("Sham");
		nameList2.add("Ritik");
		nameList2.add("Krishna");
		nameList2.add("Shree");

		nameList1.addAll(nameList2);
		System.out.println(nameList1);

		System.out.println(nameList1);
		System.out.println(nameList2);

		boolean ans = nameList1.containsAll(nameList2);
		System.out.println("ans:"
				+ " " + ans);
	}
}
