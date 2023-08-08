package com.inharitance;

class Person{
	protected String name;
	protected int age;
	protected String email;
	protected String contact;
	
	public Person(String name,int age,String email,String contact) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.contact = contact;
	}
	public void show() {
		System.out.println("Name\t:" + name +"\nAge\t:"+ age +"\nEmail\t:" + email + "\nContact\t:" + contact);
	}
	
}

class Student extends Person{
	int rollNo;;
	String address;
	
	public Student(String name,int age,String email,String contact,int rollNo, String address) {
		super(name,age,email,contact);
		this.rollNo = rollNo;
		this.address = address;
		
	}
	public void show() {
		super.show();
		System.out.println("Roll\t:" + rollNo +"\nAddress\t:" + address);
		
	}
	
	
}

class Teacher extends Person{
	String degree;
	double salary;
	
	public Teacher(String name,int age,String email,String contact,String degree, double salary) {
		super(name,age,email,contact);
		this.degree = degree;
		this.salary = salary;
		
	}
	public void show() {
		super.show();
		System.out.println("Degree\t:" + degree +"\nSalary\t:" + salary);
		
	}
}




public class PersonInfo {
public static void main(String[] args) {
	Person p1 = new Person("Ram", 24, "ram@mail.com","8768753218");
	p1.show();
	System.out.println("_________________________");
	Student s1 = new Student("Sham", 016, "sham@mail.com", "352598796", 21,"Shaniwar Peth , Pune");
	s1.show();
	System.out.println("_________________________");
	Teacher t1 = new Teacher("Shivprasad", 30, "shiv@gmail.com", "6464369687", "M.SC,B.ED", 500000);
	t1.show();
	
}
}
