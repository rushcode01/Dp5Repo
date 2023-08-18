package com.demo;

import java.util.*;

public class ArrayListDemo1 {
	public static void main(String[] args) {

		// non-generic collection
		ArrayList list = new ArrayList();// Constructs an empty list with an initial capacity

		System.out.println(list);

		// add data un list
		list.add("Ram");
		list.add(21);
		list.add(98.4);
		list.add(true);
		list.add('p');

		System.out.println(list);

		System.out.println("---------loop----------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		
		// type casting
		// as we need to d0 here explicit type casting
//		Double d= list.get(2);
		Double d = (Double) list.get(2);
		System.out.println("d :" + d);
	}
}
