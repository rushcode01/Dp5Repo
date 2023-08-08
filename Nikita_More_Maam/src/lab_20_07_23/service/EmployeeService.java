package lab_20_07_23.service;

//import lab_20_07_23.model.Person;
import lab_20_07_23.model.sub.Employee;

public class EmployeeService {
//   
	public boolean isEligibleForRetirement(Employee i) {
		if (i.getPersonAge() > 60) {
			return true;
		} else {
			return false;
		}
	}

	public void show(boolean isEligibleForRetirement) {
		if (isEligibleForRetirement == true) {
			System.out.println("Your Eligible to Retirement");
		} else {
			System.out.println("Your Eligible to Retirement");
		}

	}
}
