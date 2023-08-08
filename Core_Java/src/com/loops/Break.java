package com.loops;

public class Break {
	public static void main(String[] args) {
		int i ;
		for(i = 1; i<=20; i++) {
			if(i%3 == 0 && i%9 == 0) {
				break;
			}
			System.out.println(i);
		}
	}
}
