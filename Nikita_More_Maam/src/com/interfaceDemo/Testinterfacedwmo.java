package com.interfaceDemo;

interface Printable{
	int a= 10;
	void showMsg();
}

class Print implements Printable{
	@Override
	public void showMsg() {
		System.out.println("Printing msg");
	}
}

public interface Testinterfacedwmo {
public static void main(String[] args) {
	Print p = new Print();
	p.showMsg();
	
//	Printable p1 = new Printable();
	
	Printable p2 = new  Print();
	p2.showMsg();

}
}
