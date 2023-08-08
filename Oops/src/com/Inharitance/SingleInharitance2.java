package com.Inharitance;

class Mobile {
	String display = "Touch Screen";
}

class Samsung extends Mobile {
	String Model = "A52";
	String Storage = "16GB,500GB";
}

public class SingleInharitance2 {
	public static void main(String[] args) {
		Samsung s1 = new Samsung();
		System.out.println(s1.Model);
		System.out.println(s1.display);
		System.out.println(s1.Storage);
	}
}
