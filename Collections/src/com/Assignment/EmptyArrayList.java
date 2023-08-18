//12.	WAP to test an ArrayList is empty or not
//13.	WAP to empty ArrayList
package com.Assignment;

import java.util.ArrayList;

public class EmptyArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(01);
		list.add("Ram");
		list.add(98.8);
		list.add("Male");
		list.add(21);

		list.clear();
		System.out.println(list);

		if (list.isEmpty()) {
			System.out.println("yes ArrayList Is empty");
		} else {
			System.out.println("not Empty");
		}
	}
}
