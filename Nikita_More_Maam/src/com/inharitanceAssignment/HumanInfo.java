//Define a class ‘Human’ having data members name and gender. 
//Create classes ‘Woman’ and ‘Man’ derived from ‘Human’ having data member age in both. 
//Create objects of ‘Man’ and ‘Woman’ having a constructor to initialize all data members 
//(including super class) for both classes. Define method find() in ‘Human’ to pass objects 
//of ‘Man’ and ‘Woman’. It will find who is elder.
package com.inharitanceAssignment;

class Human {
	String name;
	String gender;

	public Human(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public void find(int mAge, int wAge) {
		if (mAge > wAge) {
			System.out.println("Man is elder than Woman");              
		} else {
			System.out.println("Woman is elder than Man");
		}
	}
}

class Man extends Human {

	int age;

	public Man(String name, String gender, int age) {
		super(name, gender);
		this.age = age;
	}
	
	public String toString() {
		return "Name\t:" + name + "\nGender\t:" + gender + "\nAge\t:" + age;
	}
}

class Woman extends Human {
	int age;

	public Woman(String name, String gender, int age) {
		super(name, gender);
		this.age = age;
	}
	public String toString() {
		return "Name\t:"+name +"\nGender\t:" + gender +"\nAge\t:"  + age;
	}
}

public class HumanInfo {
	public static void main(String[] args) {

		Human h = new Human("","");

		Man m1 = new Man("Ram", "Male", 30);
//		int ma = m1.age;
		System.out.println(m1);
		System.out.println("-------------------");
//      System.out.println(ma);
		Woman w1 = new Woman("Sita", "Female", 38);
//		int wa = w1.age;
		System.out.println(w1);
		System.out.println("-------------------");
		h.find(m1.age, w1.age);
	}

}
