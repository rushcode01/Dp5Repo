package com.ArryofObjectProgram;

public class Employee2 {

		private int id;
		private String name;
		private double salary;
		private Department dep;

		public Department getDep() {
			return dep;
		}

		public void setDep(Department dep) {
			this.dep = dep;
		}

		public Employee2(int id, String name, double salary, Department dep) {

			this.id = id;
			this.name = name;
			this.salary = salary;
			this.dep = dep;
		}

		public Employee2() {

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
			return "Employee \nid\t:" + id + "\nname\t:" + name + "\nsalary\t:" + salary + "\nDepartment\t:" + dep;
		}

		

	

}
