//2.	 WAP to print odd numbers from 521 to 229 using while loop. 
package com.whilePractice;

public class OddNumFrom521to229 {
	public static void main(String[] args) {

		int i = 521;
		while (i > 229) {

			if (i % 2 != 0) {
				System.out.println(i);
			}
			i--;
		}
	}

}
