package com.demo;

import java.util.ArrayList;

public class ArrayListDynamicTest {
public static void main(String[] args) {
	ArrayList<String> nameList = new ArrayList<String>();
	nameList.add("Ram");
	nameList.add("Sham");
	nameList.add("Keshav");
	nameList.add("Ritik");
	nameList.add("Shree");
	nameList.add("Om");
	nameList.add("Navin");
	nameList.add("Subodh");
	nameList.add("Abhishek");
	nameList.add("Suraj");
	
	for(String name: nameList) {
		System.out.println(name);
	}
	
	nameList.add("Nishank");
	nameList.add("Harshal");
	nameList.add("Krishna");
	
	System.out.println(nameList);
	
}
}
