//Write a program to define a class Employee to accept emp_id, emp _name,
//basic_salary from the user and display the gross_salary.

package com.oopsAssignment;

class Employee {
	int emp_id;
	String emp_name;
	float basic_salary;
	float HRA;
	float other_allowances;
	float gross_salary;

	public Employee(int emp_id, String emp_name, float basic_salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.basic_salary = basic_salary;
	}

	public void gross_salary(float HRA, float other_allowances) {
		gross_salary = basic_salary + HRA + other_allowances;
	}

	public String toString() {
		return "Employee Id\t: " + emp_id + "\nEmployee Name\t: " + emp_name + 
				"\nEmployee Salary\t: " + gross_salary;
	}
}

public class Employeeinfo {
	public static void main(String[] args) {
		Employee e1 = new Employee(33, "Ram Rao", 20000);
		e1.gross_salary(5000, 1500);
		System.out.println(e1);
	}

}
