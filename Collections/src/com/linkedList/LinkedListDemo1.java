package com.linkedList;

import java.util.*;

public class LinkedListDemo1 {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("rakesh");
		list.add("sham");
		list.add("hari");
		list.add("om");
		list.add("keshav");
		list.add("shree");
		System.out.println("---original----");
		System.out.println(list);

		System.out.println("---addFirst----");
		list.addFirst("sita");
		System.out.println(list);

		System.out.println("---addlast----");
		list.addLast("krish");
		System.out.println(list);

		System.out.println("---removefirst----");
		list.removeFirst();
		System.out.println(list);

		System.out.println("---removelast----");
		list.removeLast();
		System.out.println(list);
		
		System.out.println("---getfirst----");
		System.out.println(list.getFirst());
		
		System.out.println("---getlast----");
		System.out.println(list.getLast());
		
	}
	
}
