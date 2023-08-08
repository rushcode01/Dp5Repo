package com.ArrayAssignment;

public class ArrayfindmaxCharfromgivenarry {

	public static char findMaxChar(char ch[]) {
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
		return ch[len - 1];
	}

	public static void main(String[] args) {
		char arr[] = { 'A', 'a', 'D', 'E', 'x', 'Z', 'R' };
		System.out.println(findMaxChar(arr));
	}
}
