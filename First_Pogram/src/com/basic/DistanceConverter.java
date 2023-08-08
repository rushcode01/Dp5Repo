package com.basic;
import java.util.Scanner;
public class DistanceConverter {
	 
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Convert the distance from km to m and cm");
		
		System.out.println("Enter Distance in Km");
		
		float DistanceInKM = in.nextFloat();

		float DistanceInM = DistanceInKM * 1000;
		long DistanceInCM = (long)DistanceInKM * 100000;
		
		System.out.println("Distance in Meter is: " + DistanceInM);
		System.out.println("Distance in Centimeters is: " + DistanceInCM);
		
	}
}
