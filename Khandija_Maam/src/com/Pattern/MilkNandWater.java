package com.Pattern;

import java.util.*;

public class MilkNandWater {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = 0;
		while (true) {
			System.out.println("Enetr milk :");
			int milk = in.nextInt();
			System.out.println("Enetr Oil :");
			int oil = in.nextInt();

			total = (milk * 40) + (oil * 50);

			if (total > 500) {
				System.out.println("Milk = "+ milk + "Oil = "+ oil + total);
				break;
			} else if (total < 500) {
				total = total + (milk * 40) + (oil * 50);
				System.out.println("Milk = "+ milk + "Oil = "+ oil + total);		
			}
		}
	}
}
