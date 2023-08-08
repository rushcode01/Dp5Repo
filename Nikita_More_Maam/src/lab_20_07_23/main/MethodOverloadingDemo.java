package lab_20_07_23.main;

import lab_20_07_23.service.EmployeeService;
import lab_20_07_23.model.sub.Employee;

public class MethodOverloadingDemo {

	public static void main(String[] args) {

		Employee p1 = new Employee(101, "Rushikesh", 75, "SDE 1");
		System.out.println(p1);
		EmployeeService e1 = new EmployeeService();
		boolean e = e1.isEligibleForRetirement(p1);
		e1.show(e);
		
	}
}
