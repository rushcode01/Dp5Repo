package com.arraysBasic;

public class ArrayrreolaceElement {
   public static void replaceElement(int num[]) {
	   int i, len = num.length;
	   for(i = 0 ; i< len; i++) {
		   if(num[i] == 0) {
			   num[i] = 1;  
		   }
		   System.out.print(num[i]+ " ");
	   }
   }
	public static void main(String[] args) {
		
		int num[] = {78,2,55,0,8,42,79,0,0,69,56} ;
		replaceElement(num);
	}
}
