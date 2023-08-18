//8.	WAP to remove element from ArrayList
//9.	WAP to remove all elements from ArrayList

package com.Assignment;

import java.util.*;

public class RemoveElementInArray {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("Sham");
		list.add(null);
		list.add("Om");
		list.add("Hari");
		list.add(null);
		list.add("Shree");

		System.out.println("-----original list------");
		System.out.println(list);
		System.out.println("-----remove element list------");
		list.remove(1);
		System.out.println(list);
		System.out.println("-----removeAll element list------");
		list.clear();
		System.out.println(list);

	}
}
