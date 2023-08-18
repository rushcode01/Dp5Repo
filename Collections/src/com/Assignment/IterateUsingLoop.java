
//5.	WAP to iterate through all elements in an ArrayList using for loop
//6.	WAP to iterate through all elements in an ArrayList using for each

package com.Assignment;

import java.util.*;

public class IterateUsingLoop {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(01);
		list.add("Ram");
		list.add(98.8);
		list.add("Male");
		list.add(21);

		System.out.println("------for Loop------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("------for each Loop------");
		for (Object l : list) {
			System.out.println(l);
		}

	}
}
