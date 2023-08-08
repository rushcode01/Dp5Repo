package com.assignment;

public class OneXTel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for (i = 1; i <= 20; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("OneXTel");
				continue;
			} else if (i % 3 == 0) {
				System.out.println("OneX");
				continue;
			} else if (i % 5 == 0) {
				System.out.println("Tel");
				continue;
			}
			System.out.println(i);
		}
	}
}
