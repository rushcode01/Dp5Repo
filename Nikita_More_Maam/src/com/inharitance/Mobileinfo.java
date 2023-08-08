package com.inharitance;

class Mobile {
	public void msg() {
		System.out.println("This the mobile class");
	}
}

class Basic extends Mobile {
	public void msg() {
		System.out.println("This is Basic mobile class");

	}
	public void player() {
		System.out.println("Play Music");
	}
}

class Andoid extends Mobile {
	public void msg() {
		System.out.println("This is Android mobile class");
	}
	public void notification() {
		System.out.println("android notification methodqw");
	}
}

public class Mobileinfo {
	public static void main(String[] args) {

		Mobile m1 = new Mobile();
		m1.msg();

		Mobile m2 = new Basic();
		m2.msg();

		Mobile m3 = new Andoid();
		m3.msg();
		
		Basic b1 = new Basic();
		b1.msg();
		b1.player();
	}

}
