//7.	N
package com.Assignment;
import java.util.*;
public class GenericArrayList1 {
public static void main(String[] args) {
	ArrayList<String> colorList = new ArrayList<String>();
	
	colorList.add("red");
	colorList.add("Blue");
	colorList.add("Black");
	colorList.add("White");
	
	for(String list: colorList) {
		System.out.println(list);
	}
}
}
