package com.basicif;

import java.util.*;

public class GreatestnumIfnested {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter number:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();

		if (num1 > num2) {
			if (num2 > num3) {
				System.out.println(num1 + " is Gretest ");
			} else {
				System.out.println(num2 + " is Gretest");
			}

		}else  {
			if(num2>num3) {
				System.out.println(num2 + " is Gretest");
			}else {
				System.out.println(num3 + " is Gretest");
			}
		}
	}
}
