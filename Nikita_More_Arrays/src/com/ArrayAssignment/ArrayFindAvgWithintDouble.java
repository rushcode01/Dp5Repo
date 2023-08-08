//7.	Write two methods that return the average of an array with following headers.
//a.	public static int average(int[] array)
//b.	public static double average(double[] array).
//c.	Write main and invoke the 2 methods. 

package com.ArrayAssignment;

import java.util.Arrays;

public class ArrayFindAvgWithintDouble {
	public static int average(int[] array) {
		int i,sum=0 , len= array.length,avg;
		for(i = 0; i<len; i++) {
			sum += array[i];
		}
		avg = sum / len;
		return avg;
	}
	public static double average(double[] array) {
		int i,sum=0 , len= array.length,avg;
		for(i = 0; i<len; i++) {
			sum += array[i];
		}
		avg = sum / len;
		return avg;
	}
	public static void main(String[] args) {
		int arr1[]= {3,4,5,6,2,1,9};
		double arr2[]= {2,5,6,7,3,5,8};
		
		System.out.println("Average of the "+ Arrays.toString(arr1)+" is "+average(arr1));
		System.out.println("Average of the "+ Arrays.toString(arr2)+" is "+average(arr2));
		
	}

}
