//2.	Implement the inheritance as shown in below diagram. Use appropriate setter/getter 
//and constructor to initialize the access the values. Use “super” keyword to initialize 
//the Contact class properties. Also provide a method printContact() to print the contact
//detail in Contact class and override the same method according to CompanyContact and 
//EmployeeContact.

package com.inharitanceAssignment;

class Contact {
	protected int mobile;
	protected String email;
	protected String contactPerson;

	public Contact(int mobile, String email, String contactPerson) {
		this.mobile = mobile;
		this.email = email;
		this.contactPerson = contactPerson;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public int getMobile() {
		return mobile;
	}

	public String getEmail() {
		return email;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void printContact() {
		System.out.println("Contact Person\t:" + contactPerson + "\nMobile\t\t:" + mobile + "\nEmail\t\t:" + email);
	}
}

class CompanyContact extends Contact {
	String companyName;
	String website;
	String deparetment;
	String city;
	String address;
	int pin;

	public CompanyContact(int mobile, String email, String contactPerson, String companyName, String website,
			String deparetment, String city, String address, int pin) {
		super(mobile, email, contactPerson);
		this.companyName = companyName;
		this.website = website;
		this.deparetment = deparetment;
		this.city = city;
		this.address = address;
		this.pin = pin;
	}

	public void printContact() {
		System.out.println( "\nCompany Name\t:" + companyName + "\nWebsite\t\t:" + website + "\nDepartment\t:" + deparetment
				+ "\nCity\t\t:" + city + "\nAddress\t\t:" + address + "\nPin\t\t:" + pin);
	}
}

class EmployeeContact extends Contact {
	String city;
	String country;
	int pin;
	String designation;
	String dateOfBirth;

	public EmployeeContact(int mobile, String email, String contactPerson, String city, String country, int pin,
			String designation, String dateOfBirth) {
		super(mobile, email, contactPerson);
		this.city = city;
		this.country = country;
		this.pin = pin;
		this.designation = designation;
		this.dateOfBirth = dateOfBirth;
	}

	public void printContact() {
		System.out.println( "\nCity\t\t:" + city + "\nCountry\t\t:" + country + "\nPin\t\t:" + pin + "\nDesignation\t:" + designation
				+ "\nDate of Birth\t:" + dateOfBirth);
	}
}

public class COntactInfo {
public static void main(String[] args) {
	Contact c = new Contact(987652190, "sham@mail.com" , "Sham Rao");
	c.printContact();
	System.out.println("----------------------------");
	CompanyContact c1 = new CompanyContact(0,"","", "Google", "www.google.com", "R&D", "NYC", "Street 1", 100001);
	c1.printContact();
	System.out.println("----------------------------");
	EmployeeContact e = new EmployeeContact(0, null, null, "Nashik", "India", 423104, "SDE1", "12/09/1998");
	e.printContact();
	
}
}
