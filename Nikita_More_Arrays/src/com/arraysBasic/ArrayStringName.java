package com.arraysBasic;

import java.util.*;

public class ArrayStringName {

	public static void main(String[] args) {
		String names[] = new String[10];

//		int len = names.length;
		int i, n;
		Scanner in = new Scanner(System.in);
		System.out.println("How many name you want to add in arr:" + "");
		n = in.nextInt();
		for (i = 0; i < n; i++) {
			System.out.println("Enter Name :");
			names[i] = in.next();

		}
		System.out.println("-----------Array----------");
		for (i = 0; i < n; i++) {
			System.out.println("name[" + i + "]" + names[i]);
		}
	}
}
