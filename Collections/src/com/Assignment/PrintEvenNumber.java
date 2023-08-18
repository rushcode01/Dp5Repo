//18.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
package com.Assignment;

import java.util.*;

public class PrintEvenNumber {
	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();

		for (int i = 1; i <= 50; i++) {

			num.add(i);
		}

		Iterator<Integer> itr = num.iterator();

		while (itr.hasNext()) {
			if (itr.next() % 2 != 0) {
				itr.remove();
			}
		}
		for (Integer n : num) {
			System.out.println(n);
		}
	}
}
