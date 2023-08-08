package lab_20_07_23.model.sub;

import lab_20_07_23.model.Person;

public class Employee extends Person {
	String designation;

	public Employee(int personId, String personName, int personAge, String designation) {
		super(personId, personName, personAge);
		this.designation = designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public String toString() {
		return "Person Id\t: " + getPersonId() + "\nPerson Name\t: " + getPersonName() + "\nPerson Age\t: "
				+ getPersonAge() + "\nDesignation\t: " + designation;
	}
}
