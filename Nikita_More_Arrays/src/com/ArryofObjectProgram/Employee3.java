package com.ArryofObjectProgram;

public class Employee3 {

	private int eid;
	private String eName;
	private double eSalary;
	private MyDate jDate;
	public Employee3(int eid, String eName, double eSalary, MyDate jDate) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eSalary = eSalary;
		this.jDate = jDate;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public MyDate getjDate() {
		return jDate;
	}
	public void setjDate(MyDate jDate) {
		this.jDate = jDate;
	}
	@Override
	public String toString() {
		return "Employee \nEid\t\t:" + eid + "\nName\t\t:" + eName + "\nSalary\t\t:" + eSalary + "\nJoin Date\t:" + jDate ;
	}
	
	
	
}
