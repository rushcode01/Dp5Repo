//if 


package com.whilePractice;
import java.util.*;
public class Chocolate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter Chocolate:");
		int choco = in.nextInt();
		int i = 1;
		int count = 0;
		while (i <= choco) {
			count++;
			if (count % 3 == 0) {
				count++;
			}
			i++;
		}
		System.out.println("You get "+ count + " Chocolate in " + choco + "Rs."  );

	}

}
