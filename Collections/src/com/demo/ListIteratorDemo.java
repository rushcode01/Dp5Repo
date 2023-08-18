package com.demo;

import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args) {

		ArrayList<String> colorlist = new ArrayList<String>();

		colorlist.add("red");
		colorlist.add("blue");
		colorlist.add("yellow");
		colorlist.add(null);
		colorlist.add("white");

		System.out.println("-=-------forward----------");
		ListIterator<String> listitr = colorlist.listIterator();
		while (listitr.hasNext()) {
			System.out.println(listitr.next());
		}

		System.out.println("-----backword-----");
		while (listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
	}
}
