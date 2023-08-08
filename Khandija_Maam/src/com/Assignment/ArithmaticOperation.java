package com.Assignment;

import java.util.Scanner;

public class ArithmaticOperation {
	int num1;
	int num2;
	double addition;
	double substraction;
	double multiplication;
	double division;

	public ArithmaticOperation(int numn, int numm, double addition, double substraction, double multiplication,
			double division) {
		num1 = numn;
		num2 = numm;
		this.addition = addition;
		this.substraction = substraction;
		this.multiplication = multiplication;
		this.division = division;
	}

	public double addition() {
		display();
		addition = num1 + num2;
		return addition;
	}

	public double substraction() {
		display();
		substraction = num1 - num2;
		return substraction;
	}

	public double multiplication() {
		display();
		multiplication = num1 * num2;
		return multiplication;
	}

	public double division() {
		display();
		division = num1 / num2;
		return division;
	}

	public void display() {
		System.out.println("1st Number " +num1);
		System.out.println("2st Number " +num2);
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ch;
		
		do {
		System.out.println("Enter 1st Number:");
		int num1= in.nextInt();
		System.out.println("Enter 2st Number:");
		int num2= in.nextInt();
		System.out.println("1.Addition \n2.Substraction \n3.multiplication  \n4.division \5.Exit");
		System.out.println("Enter Choice : ");
		ArithmaticOperation a = new ArithmaticOperation(num1, num2, 0, 0, 0, 0);
		int choice = in.nextInt();

	    switch(choice) {
	    case 1:
	    	System.out.println( "Addition:" +a.addition());
	    	
	    	break;
	    case 2:
	    	System.out.println( "Substraction:" +a.substraction());
	    	break;
	    case 3:
	    	System.out.println( "Multiplication:" +a.multiplication());;
	    	break;
	    case 4:
	    	System.out.println( "Division:" +a.division());;
	    	break;
	    case 5:
	    	System.exit(0);
	    	break;
	    
		}System.out.println("Do you want to do Operation? y/n");
		ch = in.next().charAt(0);
	} while (ch == 'y' || ch == 'Y');
	}
}
