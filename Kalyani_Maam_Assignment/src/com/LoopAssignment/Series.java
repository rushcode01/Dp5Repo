//Serie 0,3,8,15,24,35,48.....nterms

package com.LoopAssignment;

import java.util.*;

public class Series {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		
		
		for(int i = 1; i<= n;i++) {
			System.out.print(((i*i)-1)+ " ");
		}
		
	}
}
