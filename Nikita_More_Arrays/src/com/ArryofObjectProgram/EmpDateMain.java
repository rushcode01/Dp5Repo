package com.ArryofObjectProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EmpDateMain {

	public static void main(String[] args) {
		MyDate d1 = new MyDate(21, 2, 2009);
		MyDate d2 = new MyDate(1, 3, 2014);
		MyDate d3 = new MyDate(19, 4, 2009);
		MyDate d4 = new MyDate(16, 5, 2015);
		MyDate d5 = new MyDate(11, 9, 2012);
		MyDate d6 = new MyDate(22, 7, 2013);

		Employee3 e[] = new Employee3[10];
		e[0] = new Employee3(101, "Ram Kumar", 30000, d1);
		e[1] = new Employee3(102, "Sham Rao", 23000, d2);
		e[2] = new Employee3(103, "Sushil Nikam", 24000, d3);
		e[3] = new Employee3(104, "Navin Kumar", 32000, d4);
		e[4] = new Employee3(105, "Sachin Jadav", 28000, d5);
		e[5] = new Employee3(106, "Rajkumar", 48000, d4);
		e[6] = new Employee3(107, "Abhishek kale", 38000, d5);
		e[7] = new Employee3(108, "Rushi Jadav", 27000, d4);
		e[8] = new Employee3(109, "Vishal Wagh", 17000, d5);
		e[9] = new Employee3(110, "Rahul Garud", 34000, d6);

		for (Employee3 ed : e) {
			if (ed.getjDate().getYear() > 2010) {
				System.out.println(ed);
				System.out.println("--------------------------------");
			}
		}

		System.out.println("==============Same Joinimg Date Emp=================");
		for (int i = 0; i < e.length; i++) {
			int count = 0;
			for (int j = i + 1; j < e.length; j++) {

				if (e[i].getjDate().getDate() == e[j].getjDate().getDate()
						&& e[i].getjDate().getMonth() == e[j].getjDate().getMonth()
						&& e[i].getjDate().getYear() == e[j].getjDate().getYear()) {

					count++;

				}

			}
			if (count > 0) {
				System.out.println(e[i]);
				System.out.println("--------------------------------");
			}
		}
	}
}
