package com.demo;

import java.util.*;

public class ItreratorDemo {
public static void main(String[] args) {
	ArrayList<String> colorlist = new ArrayList<String>();
	
	colorlist.add("red");
	colorlist.add("blue");
	colorlist.add("yellow");
	colorlist.add(null);
	colorlist.add("white");
	
	Iterator<String>itr = colorlist.iterator();
	
	
//	System.out.println(itr.hasNext());
//	System.out.println(itr.next());
//	System.out.println(itr.hasNext());
//	System.out.println(itr.next());
//	System.out.println(itr.hasNext());
//	System.out.println(itr.next());
//	System.out.println(itr.hasNext());
//	System.out.println(itr.next());
//	System.out.println(itr.hasNext());
//	System.out.println(itr.next());
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
