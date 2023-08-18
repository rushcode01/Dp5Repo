//4.	WAP to print all elements of ArrayList using iterator
package com.Assignment;

import java.util.*;
import java.util.Iterator;

public class Iterators {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(01);
		list.add("Ram");
		list.add(98.8);
		list.add("Male");
		list.add(21);

		Iterator<Object> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
