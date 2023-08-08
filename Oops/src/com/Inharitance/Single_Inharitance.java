package com.Inharitance;

	class Animal 
	{
		String legs = "4";
		
	}
	class Cat extends Animal{
		String color ="Black" ;
		String food = " Cat Food";

	}
	
	public class Single_Inharitance {
	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		System.out.println(c1.legs +" " + c1.color + c1.food);
		
	}
}
