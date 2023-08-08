package com.ArryofObjectProgram;

public class EmpDeptMain {

	public static void main(String[] args) {
		Department it = new Department(201, "Information Technology");
		Department hr = new Department(202, "HR");
		Department acc = new Department(203, "Accounts");
		Department sl = new Department(204, "Sales");

		Employee2[] e = new Employee2[5];

		e[0] = new Employee2(111, "Sham", 21000, it);
		e[1] = new Employee2(112, "Sundar", 12000, hr);
		e[2] = new Employee2(113, "Akash", 15000, acc);
		e[3] = new Employee2(114, "Ram", 16000, sl);
		e[4] = new Employee2(115, "Rohan", 25000, it);

//		 System.out.println(Arrays.toString(e));
		System.out.println("--------sales dept emp-----------");
		for (Employee2 es : e) {
			if (es.getDep().getDid() == 204) {
				System.out.println(es);
			}
		}
		System.out.println("-------Same Dpt Emp----------");
		for (Employee2 ed : e) {
			if (ed.getDep().getDid() == 201) {
				System.out.println(ed);
				System.out.println("...............");
			}
		}

	}
}
