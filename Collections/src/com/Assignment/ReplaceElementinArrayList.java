//23.	WAP to replace the second element of an ArrayList with the specified element
package com.Assignment;

import java.util.*;

public class ReplaceElementinArrayList {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("Sham");
		list.add("Hari");
		list.add("Om");
		list.add("Shree");
		list.add("Krish");
		list.add("Ganesh");
		list.add("Vinayak");

		for (String s : list) {
			System.out.print(s + " ");
		}

		list.set(2, "sita");

		System.out.println("\n----------After replace------------");
		for (String s : list) {
			System.out.print(s + " ");
		}
	}
}
