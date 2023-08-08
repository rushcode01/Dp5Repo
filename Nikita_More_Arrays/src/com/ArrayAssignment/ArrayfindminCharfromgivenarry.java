//34.	WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], 
//so min character is ‘A’. 

package com.ArrayAssignment;

public class ArrayfindminCharfromgivenarry {

	public static char findMinChar(char ch[]) {
		int i, j, len = ch.length;

		for (i = 0; i < len; i++) {
			for (j = 0; j < len - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					char temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
		return ch[0];
	}

	public static void main(String[] args) {
		char arr[] = { 'A', 'a', 'D', 'E', 'x', 'z', 'R' };
		System.out.println(findMinChar(arr));

	}
}
