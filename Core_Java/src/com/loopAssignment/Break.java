
//WAP to show the use of break statement ( in for loop)
package com.loopAssignment;

public class Break {
	public static void main(String[] args) {
		
		int i;
		for(i = 1; i<=20; i++) {
			if(i % 5 == 0) {
				break;
			}
			System.out.println(i);
		}
	}

}
