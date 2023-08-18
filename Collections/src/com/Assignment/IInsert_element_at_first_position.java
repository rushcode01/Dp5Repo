//17.WAP to insert an element into the ArrayList at the first position
package com.Assignment;

import java.util.*;

public class IInsert_element_at_first_position {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Ram");
		list1.add("Sham");
		list1.add("Ritik");
		list1.add("Ram");
		list1.add("Om");

		list1.add(0, "Shree");

		for (String s : list1) {
			System.out.println(s);
		}
	}
}
