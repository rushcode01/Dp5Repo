package com.Students;

public class Students {
	private int id;
	private String sname;
	private double per;
	private boolean place;

	public void setId(int id) {
		this.id = id;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public void setPlac(boolean place) {
		this.place = place;
	}

	public int getId() {
		return id;
	}

	public String getSname() {
		return sname;
	}

	public double getPer() {
		return per;
	}

	public boolean getPlace() {
		return place;
	}

	public void display() {
		System.out.println("Student Id: " + id + " Student Name: " + sname + " Your Per %: " + per);
	}
}
