package com.abstractionAssignment;

abstract class Company {
	String company_name;

	public Company(String company_name) {
		this.company_name = company_name;
	}

	public abstract void full_time();

	public abstract void over_time();

	public abstract void salary();
}

class Employee extends Company {
	String employee_name;
	int employee_id;
	double over_time_hour;
	double full_time_hour;
	double salary, salaryF, salaryO;

	public Employee(String company_name, String employee_name, int employee_id, double full_time_hour,
			double over_time_hour) {
		super(company_name);
		this.employee_name = employee_name;
		this.employee_id = employee_id;
		this.over_time_hour = over_time_hour;
		this.full_time_hour = full_time_hour;

	}

	public String toString() {
		return "Company Name\t: " + company_name + "\nEmployee Name\t: " + employee_name + "\nEmployee Id\t: "
				+ employee_id + "\nEMployee Name\t: " + salary;
	}

	@Override
	public void full_time() {
		salaryF = full_time_hour * 500;

	}

	@Override
	public void over_time() {
		salaryO = over_time_hour * 200;

	}

	public void salary() {
		salary = salaryF + salaryO;
	}
}

public class Employeeinfo {
	public static void main(String[] args) {
		Company e = new Employee("Shreeram Industries", "Ram kumar", 231, 6, 2);
		e.full_time();
		e.over_time();
		e.salary();
		System.out.println(e);

	}
}
