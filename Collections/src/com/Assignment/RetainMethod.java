//10.	WAP to retain all elements from ArrayList

package com.Assignment;

import java.util.*;

public class RetainMethod {
	public static void main(String[] args) {

		ArrayList<String> schoolBag = new ArrayList<String>();

		schoolBag.add("pen");
		schoolBag.add("books");
		schoolBag.add("pencile");
		schoolBag.add("tifin");
		schoolBag.add("raincoat");
		schoolBag.add("waterbottle");

		ArrayList<String> tutionBag = new ArrayList<String>();
		tutionBag.add("pen");
		tutionBag.add("books");
		tutionBag.add("pencile");
		tutionBag.add("umbrella");

		System.out.println(schoolBag);
		System.out.println(tutionBag);

		System.out.println("------After retain Method--------");

		schoolBag.retainAll(tutionBag);
		System.out.println(schoolBag);

	}
}
