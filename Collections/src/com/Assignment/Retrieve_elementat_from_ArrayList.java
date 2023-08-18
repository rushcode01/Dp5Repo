//16.	WAP to retrieve an element (at a specified index) from a given ArrayList
package com.Assignment;

import java.util.*;

public class Retrieve_elementat_from_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("Sham");
		list.add("hari");
		list.add("Om");
		list.add("Krish");

		Scanner in = new Scanner(System.in);
		System.out.println("Enter index:");
		int num = in.nextInt();

		if (num > 0 && num < list.size()) {
			System.out.println("Element at " + num + " is : " + list.get(num));
		} else {
			System.out.println("invalid Index");
		}
	}
}
