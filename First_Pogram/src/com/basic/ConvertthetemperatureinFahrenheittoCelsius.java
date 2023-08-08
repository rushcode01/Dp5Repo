package com.basic;
import java.util.Scanner;
public class ConvertthetemperatureinFahrenheittoCelsius {
	
	public static void main(String args[]) {
		
		
		System.out.println("Convert the temperature in Fahrenheit to Celsius:-");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println( " Enter Temperature in Fahrenheit: ");
		
		float fahrenheit = in.nextFloat();
		
		float celsius = ((fahrenheit-32)*5)/9;
		
		System.out.println("Temperature in Celsius is " + celsius + "°C.");
		
		
		
		
	}

}
