package com.NumberProblem;

import java.util.*;

public class Trymorphic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter number:");

		int num = in.nextInt();
		int temp = num;
		int  last =num;
		int n = num * num * num;
		int ntry = n;
		int count = 0;
		int pro = 1;
		int i = 1;
		while (temp > 0) {
		temp = temp / 10;
			count++;
		}
		while (i <= count) {
			pro = pro * 10;
			i++;
		}
		
//		System.out.println(pro);
//		System.out.println(ntry);
		int tri = ntry % pro;
		
//		System.out.println(tri);
		if (tri == last) {
			System.out.println("Its Trymorphic");
		} else {
			System.out.println("Not Trymorphic");
		}
	}
}
