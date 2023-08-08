package com.oopsBasic;

public class BasicofOops {
	
	int id;
	String name;
	double per;
	
	
	public static void main(String[] args) {
//		System.out.println(id);    it show error cant access by local variable
		
		BasicofOops stud1 = new BasicofOops();
		stud1.id = 001;
		stud1.name="Ram";
		stud1.per=76.86;
		
		System.out.println(stud1.id + " "+ stud1.name + " "+ stud1.per);
		
	}

}
