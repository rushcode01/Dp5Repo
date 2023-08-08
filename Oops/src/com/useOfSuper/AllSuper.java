package com.useOfSuper;

class Animal {
	public Animal(String name) {
		System.out.println(name);
	}

}

class Cat extends Animal {
	Cat() {
		super("Cat");
		System.out.println("meow...");
	}
	Cat(String name){
		this();
		System.out.println(name);
	}

}

class dog extends Animal{
	dog(){
		super("Dog");
		System.out.println("Bark");
	}
	dog(String name){
		this();
		System.out.println(name);
	}
}

public class AllSuper {
	public static void main(String[] args) {
      
		Cat Bella = new Cat();
		Cat c1 = new Cat("Rani"); 
		dog ravan = new dog();
		dog jivan = new dog("JIvan");
	}
}
