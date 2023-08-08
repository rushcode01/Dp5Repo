/*You have hundred items (1,2,3,…100) the price of each item is 
 * the same as its number. i.e., item 1 is of 1 rs. Item 2 is of 2 rs. And so on.
Calculate the total of the items.*/

package com.assignment;

public class TotalOfItem {
	public static void main(String[] args) {
       System.out.println("You have hundred items (1,2,3,…100) the price of each item is the same as its number. i.e., item 1 is of 1 rs. Item 2 is of 2 rs. And so on.\r\n"
       		+ "Calculate the total of the items.");
		int i;
		int sum = 0;
		for(i = 1; i<= 100; i++) {
			sum = sum + i;
			
		}
		System.out.println("Total of Item is "+ sum);
	}
}
