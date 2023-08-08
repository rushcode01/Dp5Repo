package com.basic;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String args[]) {
    	
    	
    	System.out.println("To find Area of Circle");
    	
    
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Enter Radius : ");
    	float r = in.nextFloat();
    	
    	float pi = 3.1415f;
    	
    	float areaofcircle = pi * r * r;
    	
    	System.out.println("Area of Circle for r: " + r + " is " + areaofcircle);
    }
}
