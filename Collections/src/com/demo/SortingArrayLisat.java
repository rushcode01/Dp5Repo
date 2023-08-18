package com.demo;

import java.util.*;
import java.util.jar.Attributes.Name;

public class SortingArrayLisat {
	public static void main(String[] args) {
		ArrayList<String> namwList = new ArrayList<String>();

		namwList.add("radha");
		namwList.add("sham");
		namwList.add("priya");
		namwList.add("aman");
		namwList.add("bhrat");

		System.out.println("----------namelist-----");
		System.out.println(namwList);
		Collections.sort(namwList);
		Collections.reverse(namwList);
	//	Collections.shuffle(namwList);
		System.out.println("---collection methos list---");
		System.out.println(namwList);

	}
}
