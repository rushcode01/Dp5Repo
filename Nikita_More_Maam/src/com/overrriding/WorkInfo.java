//)WAP to create class Programmer with Method workingHours().create class 
//Employee which extends Programmer implement workingHours()differently in 
//child.

package com.overrriding;

class Programmer {
	float wHours;

	public void workingHours(float wHours) {
		this.wHours = wHours;
	}

	public String toString() {
		return "workingHours " + wHours;
	}
}

class Employees extends Programmer {
	public void workingHours(float wHours) {
		this.wHours = wHours;
	}
}

public class WorkInfo {
	public static void main(String[] args) {
		Employees e1 = new Employees();
		e1.workingHours(6.30f);
		System.out.println(e1);
	}
}
