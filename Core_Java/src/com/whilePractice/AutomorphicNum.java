package com.whilePractice;

import java.util.*;

public class AutomorphicNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number To check its Automorphic:");
		int n = in.nextInt();
		int newn = n;
		int count = 0;
		int i = 1;
		int pro = 1;
		int num = n * n;
		int numa = num;
		while (num > 0) {
//			int digit = num % 10;
			num = num / 10;
			count++;
		}
//		System.out.println(count);
		while (i < count) {
			pro = pro * 10;
			i++;
		}
//		System.out.println(pro);

		int n1 = numa % pro;
		System.out.println(n1);

		if (n1 == newn) {
			System.out.println("Number is Automorphic...");
		} else {
			System.out.println("Not Automorphic...");
		}
	}
}
