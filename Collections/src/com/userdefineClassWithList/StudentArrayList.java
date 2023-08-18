package com.userdefineClassWithList;

import java.util.*;

public class StudentArrayList {
	
	
	
	
	
	public static void main(String[] args) {

		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(101, "Ram", 45));
		slist.add(new Student(102, "Sham", 89));
		slist.add(new Student(103, "Hari", 76));
		slist.add(new Student(104, "Om", 98));
		slist.add(new Student(105, "Shiv", 87));
		slist.add(new Student(106, "kavita", 85));

		System.out.println("------Student list-----");
		System.out.println(slist);

		System.out.println("---Student list with to string----");
		for (int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i));
		}
		System.out.println("---student list without to String()---");
		for (int i = 0; i < slist.size(); i++) {
			Student s = slist.get(i);
			s.show();
		}

		System.out.println("---student list without to String()---");
		for (int i = 0; i < slist.size(); i++) {
			Student s = slist.get(i);
			System.out.println(s.getId() + " " + s.getName() + " " + s.getMarks());
		}

		// for-each
		System.out.println("---student list with for each loop---");
		for (Student s : slist) {
			System.out.println(s);
		}

		// Iterator

		Iterator<Student> ster = slist.iterator();
		System.out.println("---student list with Iterator---");
		while (ster.hasNext()) {
//			System.out.println(ster.next());
			Student s = ster.next();
			System.out.println(s);
		}

		System.out.println("---name is present or not---");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = in.next();
		for (int i = 0; i < slist.size(); i++) {
			Student s = slist.get(i);

			if (s.getName().equals(name)) {

				System.out.println(name + " is present in list");
			} else {
				System.out.println(name + " is not present in list");
				break;
			}
		}
		
		
		System.out.println("-----------student in range-------");
		
		for (int i = 0; i < slist.size(); i++) {
			Student s = slist.get(i);
			
			if(s.getId()>=103) {
				System.out.println(s);
			}
		}
	}
}
