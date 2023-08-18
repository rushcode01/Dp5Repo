//19.	WAP to match two collections
package com.Assignment;

import java.util.ArrayList;

public class Match_two_collections {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Ram");
		list1.add("Sham");
		list1.add("Ritik");
		list1.add("Ram");
		list1.add("Om");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ram");
		list2.add("Sham");
		list2.add("Ritik");
		list2.add("Ram");
		list2.add("Om");
		
		if(list1.equals(list2)) {
			System.out.println("Both collections Match");
		}else {
			System.out.println("Both not collections Match");
			
		}
	}
}
