package com.nestedContainment;

public class StaticOverload {

	static void Overload(int a, int b) {
		System.out.println(a + b);
	}

	static void Overload(int a, float b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {

     StaticOverload s1= new StaticOverload();
     s1.Overload(2, 2);
     s1.Overload(1, 3.4f);
	}
}
