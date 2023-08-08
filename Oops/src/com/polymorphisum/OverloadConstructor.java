package com.polymorphisum;

public class OverloadConstructor {

	
	public OverloadConstructor(int num1, int num2) {

		int temp =num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
	}
	public OverloadConstructor(char a, char b) {
		char temp = a;
		a = b;
		b = temp;
		System.out.println("char1:"+ a );
		System.out.println("char2:"+ b);
		
	}

	public static void main(String[] args) {
		OverloadConstructor a=new OverloadConstructor('a', 'b');
		OverloadConstructor b = new OverloadConstructor(22, 11);

	}

}
