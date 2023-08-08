package com.Inharitance;

class Wild_a {
	 void eating() {
		System.out.println("Eating...");
	}
}
class Panther extends Wild_a{
	void Run() {
		System.out.println("Running...");
	}
}
class tiger extends Wild_a{
	void roar() {
		System.out.println("Roaring...");
	}
	
}
public class HierarchicalInharitance {
	public static void main(String[] args) {
		
		Panther Rock = new Panther();
		Rock.Run();
		tiger Shera = new tiger();
		Shera.roar();
		
	}
}
