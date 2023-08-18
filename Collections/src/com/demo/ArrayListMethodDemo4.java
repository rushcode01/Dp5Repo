package com.demo;

import java.util.ArrayList;

public class ArrayListMethodDemo4 {
	public static void main(String[] args) {
		ArrayList<String> colorlist = new ArrayList<String>();
		colorlist.add("red");
		colorlist.add("blue");
		colorlist.add("yellow");
		colorlist.add(null);
		colorlist.add("white");
		
		System.out.println(colorlist);
		
		String s = colorlist.remove(0);
		System.out.println("s=" + s);
		System.out.println(colorlist);
		/////////////////////////////////////////

		boolean ans = colorlist.remove("black");
		System.out.println("ans=" + ans);
		System.out.println(colorlist);
	}
}
