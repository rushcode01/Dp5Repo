package com.demo;
import java.util.*;
public class ArrayListtoArray {
public static void main(String[] args) {
	
	ArrayList<String> namwList = new ArrayList<String>();

	namwList.add("radha");
	namwList.add("sham");
	namwList.add("priya");
	namwList.add("aman");
	namwList.add("bhrat");
	
	int size = namwList.size();
	
	//case1
	Object strarr[] = namwList.toArray();
	
	System.out.println("---array----");
	for (Object s : strarr) {
		System.out.println(s);
	}
	
	//case2
	String arr1[] = new String[size];
	arr1 = namwList.toArray(arr1);
	System.out.println("---array1----");
	for (String s : arr1) {
		System.out.println(s);
	}
	
	//case3
	String newstr[] = new String[size];
	
	for(int i = 0; i< size; i++) {
		newstr[i] = namwList.get(i);
	}
	System.out.println("---array2----");
	for (String s : newstr) {
		System.out.println(s);
	}
	
	// Array to ArrayList
	
	String arr2[]= {"ram","sham","Gopal"};
	//case1
	List<String> nlist= Arrays.asList(arr2);
	System.out.println("-----list-----");
	System.out.println(nlist);
	
	//case2
	List<String> alist= new ArrayList<String>();
	Collections.addAll(alist, arr2);
	System.out.println(alist);
	
}
}
