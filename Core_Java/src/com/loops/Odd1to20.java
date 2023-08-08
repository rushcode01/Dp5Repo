package com.loops;

public class Odd1to20 {
	public static void main(String[] args) {
		
		int i;
		int count = 0;
		for(i = 1; i<=20; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Number of Odd" +count);
	}

}
