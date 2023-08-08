package com.LoopAssignment;

import java.util.*;

public class Kaprekar {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = in.nextInt();
		int temp = num;
		int sq = num*num;
		System.out.println(sq);
		int count = 0;
		int pro = 1;
		num = temp;
		while(num>0) {
			num = num / 10;
			count++;
		}
//		System.out.println(count);
		for(int i=1; i<=count;i++) {
			pro = pro * 10;
		}
//		System.out.println(pro);
		int sum = 0;
		while(sq>0) {
			int s = sq % pro;
			System.out.println(s);
			
			sum = sum + s;
//			System.out.println(sum);
			sq = sq/pro;
			
			
		}
		System.out.println(sum);
		
		if(temp == sum) {
			System.out.println("This is Kaprekar Number");
		}else {
			System.out.println("This is Not Kaprekar Number");
			
		}
	}

}
