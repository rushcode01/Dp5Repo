package com.abstraction;


abstract class Animal {
	
	public String name;
	public Animal(String name) {
		this.name = name;
	}
	public abstract void makeSound();

	public void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	Dog(String name){
		super(name);
	}
	public void makeSound() {
		System.out.println(name + " Bark");
	}
}

class Cat extends Animal {
	Cat(String name){
		super(name);
	}
	public void makeSound() {
		System.out.println( name + " Meow");
	}
}

public class TestAbstractionClass {

	public static void main(String[] args) {

//		Animal a = new Animal();// can not  creat object
		Animal a1 = new Dog("Rocky");
		a1.eat();
		a1.makeSound();

		a1 = new Cat("Bella");
		a1.eat();
		a1.makeSound();
	}
}
