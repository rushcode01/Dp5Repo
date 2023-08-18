package com.demo;

import java.util.ArrayList;

public class ArrayListMethodDemo1 {
	public static void main(String[] args) {

		ArrayList<String> nameList = new ArrayList<String>();
        
		System.out.println("isEmpty():" + nameList.isEmpty());
		nameList.add("Ram");
		nameList.add("Sham");
		nameList.add("Ritik");
		nameList.add(null);
		nameList.add("Ram");
		nameList.add("Om");
		nameList.add(null);

		System.out.println("isEmpty():" + nameList.isEmpty());

		System.out.println(nameList);
		System.out.println(nameList.size());

		nameList.add(2, "raj");
		System.out.println("------after add----");
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		System.out.println("------after set----");
		nameList.set(2, "neha");
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		int i = nameList.indexOf("Ram");
		System.out.println("i :" + i);
		
		int j = nameList.lastIndexOf("Ram");
		System.out.println("j :" + j);
		
		boolean ans = nameList.contains("Sham");
		System.out.println(ans);
		boolean ans1 = nameList.contains("harshal");
		System.out.println(ans1);
		
		nameList.clear();
		System.out.println(nameList);
	}
}
