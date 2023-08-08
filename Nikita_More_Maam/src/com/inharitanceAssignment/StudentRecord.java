//1.	Declare a class ‘Student’ with data members ‘name’, ‘roll number’ and ‘marks’.
//Also declare a class ‘MyRecord’ which inherited from class ‘Student’. 
//Display name, roll number and percentage by creating the object of class MyRecord.

package com.inharitanceAssignment;

class Student {
	String name;
	int rollNum;
	

	public Student(String name,int rollNum) {
	this.name=name;
	this.rollNum=rollNum;
	
	}
}
class Record extends Student {
	double s1,s2,s3;
	double per;
	public Record(String name,int rollNum,double s1,double s2,double s3){
		super(name,rollNum);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		
	}
	public void per() {
		this.per = ((s1+s2+s3)/3);
	}
	public void show() {
		System.out.println("Student Name\t:"+ name + "\nRoll Number\t:"+ rollNum + "\nPercentage\t:"+ this.per );
	}
}

class MyRecord extends Student{
	String address; 
	public MyRecord(String name,int rollNum,float marks,String address) {
		super(name,rollNum);
		this.address = address;
	}
	
	public void show() {
		System.out.println("Student Name\t:"+ name + "\nRoll Number\t:"+ rollNum  + "\nStudent Address\t:"+ address);
	}
}

public class StudentRecord {
public static void main(String[] args) {
	Record r1 = new Record("Ram",22,88,76,98);
	r1.per();
	r1.show();
	System.out.println("---------------------------");
	MyRecord r2 = new MyRecord("Shree", 21, 85, "Sadashiv Peth, Pune");
	r2.show();
}
}
