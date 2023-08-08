package com.finalKeyWord;

class Os {
	public void coding() {
		System.out.println("Os Code");
	}

	public final void display() {
		System.out.println(" os Display");
	}
}

class Windows extends Os {
	public void coding() {
		System.out.println("Wndows code");
	}

//	public void display() {
//		System.out.println("Windows Display");
//	}
}

public class FinalMethod {
	public static void main(String[] args) {
		Windows w1 = new Windows();
		w1.coding();
		w1.display();
	}
}
