package com.loops;

public class Continue {

	public static void main(String[] args) {
		int i;

		for (i = 0; i <= 20; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
