package com.demo;

import java.util.*;

public class Program1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			list.add(in.next());

		}
		for (String list1 : list) {
			list1 = list1.toUpperCase();
			System.out.print(list1 + " ");
		}
	}
}
