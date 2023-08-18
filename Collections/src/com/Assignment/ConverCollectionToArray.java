//21.	WAP to convert collection into array
package com.Assignment;

import java.util.ArrayList;

public class ConverCollectionToArray {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Sham");
		list.add("hari");
		list.add("om");
		list.add("sita");

		Object arr[] = list.toArray();

		for (Object a : arr) {
			System.out.println(a);
		}
	}
}
