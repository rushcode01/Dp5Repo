package com.demo;

import java.util.ArrayList;

public class ArrayListMethodDemo3 {
public static void main(String[] args) {
	ArrayList<String> schoolbag = new ArrayList<String>();
	schoolbag.add("pen");
	schoolbag.add("books");
	schoolbag.add("pencile");
	schoolbag.add("tifin");
	schoolbag.add("raincoat");
	schoolbag.add("waterbottle");
	
	ArrayList<String> tutionbag = new ArrayList<String>();
	tutionbag.add("pen");
	tutionbag.add("books");
	tutionbag.add("pencile");
	tutionbag.add("umbrella");

	
	System.out.println("School bag List :"  + schoolbag);
	System.out.println("School bag List :"  + tutionbag);
	schoolbag.retainAll(tutionbag);
	System.out.println("School bag List :"  + schoolbag);
	System.out.println("School bag List :"  + tutionbag);
	
	
}
}
