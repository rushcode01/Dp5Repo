package com.arrayObject;

public class StudentTestByCOnstructor {
	public static void showNames(Student s[]) {
		int i, len = s.length;
		for (i = 0; i < len; i++) {
			if (s[i].getMarks() >= 80) {
				System.out.println(s[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stuarr[] = new Student[5];

		stuarr[0] = new Student(11, "Ram", 97);
		stuarr[1] = new Student(12, "Sham", 90);
		stuarr[2] = new Student(13, "Suresh", 77);
		stuarr[3] = new Student(14, "Ramraoao", 56);
		stuarr[4] = new Student(15, "Kumar", 67);

		System.out.println("-------FOR LOOP-------");
		for (int i = 0; i < stuarr.length; i++) {
			System.out.println(stuarr[i]);
		}

		System.out.println("-------FOR EACH LOOP-------");
		for (Student s : stuarr) {
			System.out.println(s);
		}
		System.out.println("------Student Name Marks More Than 80-------");
		showNames(stuarr);

	}

}
