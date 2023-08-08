package com.loops;

public class OnexTel {
	public static void main(String[] args) {
 
		int i = 1;
		
		for (i = 1; i<=20;i++) {
			if(i % 3 == 0 && i % 5 ==0 ) {
				System.out.println("OneXTel");
				continue;
			}else if(i%3 == 0) {
				System.out.println("OneX");
				continue;
			}else if (i%5 == 0) {
				System.out.println("Tel");
				continue;
			}
			System.out.println(i);
		}
	}
}
