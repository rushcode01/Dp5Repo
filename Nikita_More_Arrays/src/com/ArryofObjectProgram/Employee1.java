package com.ArryofObjectProgram;

public class Employee1 {

	private int id;
	private String name;
	private double salary;

	public Employee1(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee1() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 id = " + id + ", name = " + name + ", salary = " + salary;
	}

	public static void main(String[] args) {
		Employee1[] em = new Employee1[3];

		em[0] = new Employee1(101, "Ram", 12368);
		em[1] = new Employee1(102, "Sham", 18262);
		em[2] = new Employee1(103, "Kumar", 9999);

		for (Employee1 employee1 : em) {

			System.out.println(employee1);
		}
		System.out.println("--------- salary greter than 10000---------------");
		for (Employee1 employee1 : em) {
			if(employee1.salary > 10000) {
				System.out.println(employee1);
			}
		}
	}

}
