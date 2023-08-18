package com.demo;

import java.util.*;

public class ArrayListDemo2 {
	public static void main(String[] args) {

		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Ram");
		nameList.add("Sham");
		nameList.add(null);
		nameList.add("Ritik");
		nameList.add("Shree");
		nameList.add("Om");
		nameList.add(null);

		System.out.println(nameList);

		String s = nameList.get(0);
		System.out.println(s);

		System.out.println("----by for loop----");
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}

		System.out.println("---for eacg loop----");
		for (String s1 : nameList) {
			System.out.println(s1);
		}
	}
}
