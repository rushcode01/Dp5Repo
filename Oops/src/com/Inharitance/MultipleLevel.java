package com.Inharitance;

class Company{
	String name="X infotech Pvt.Ltd.";
	public void cname(){
		System.out.println("Company Name: "+name);
	}
}

class Dept extends Company{
	String dname="Tech";
	
	public void dname() {
		System.out.println("Department Name: " + dname);
	}
}

class TeamLeader extends Dept{
	String tlName = "Ramesh k";
	public void tlname() {
		System.out.println("TL Name: "+ tlName);
	}
}


public class MultipleLevel {
	public static void main(String[] args) {
		TeamLeader t1 = new TeamLeader();
		t1.cname();
		t1.dname();
		t1.tlname();
	}

}
