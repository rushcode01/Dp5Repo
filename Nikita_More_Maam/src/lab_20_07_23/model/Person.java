package lab_20_07_23.model;

public class Person {
	private int personId;
	private String personName;
	private int personAge;

	public Person(int personId) {
		this.personId = personId;
	}

	public Person(int personId, String personName) {
		this.personId = personId;
		this.personName = personName;
	}

	public Person(int personId, String personName, int PersonAge) {
		this.personId = personId;
		this.personName = personName;
		this.personAge = PersonAge;
	}

	public void setPersonId(int id) {
		this.personId = id;
	}

	public void setPersonName(String name) {
		this.personName = name;
	}

	public void seName(int personAge) {
		this.personAge = personAge;
	}

	public int getPersonAge() {
		return personAge;
	}

	public int getPersonId() {
		return personId;
	}

	public String getPersonName() {
		return personName;
	}

	public String toString() {
		return "" + personId + "" + personName + " " + personAge;
	}
}
