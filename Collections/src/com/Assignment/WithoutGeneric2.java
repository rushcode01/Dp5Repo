//2.	WAP add elements to arraylist without using generics, 0th location keep Integer,
//1st location String now print each element and display contents.

package com.Assignment;

import java.util.*;

public class WithoutGeneric2 {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(01);
		list.add("Ram");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
