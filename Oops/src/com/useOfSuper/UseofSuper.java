package com.useOfSuper;

class Laptop{
	int price = 65000; 
	void showLaptop(){
		System.out.println("Gaming...");
		
	}
}
class Lenovo extends Laptop{
	int price = 70000;
    void price() {
    	int price = 90000;
    	System.out.println(super.price +" "+this.price+" " + price );
    	super.showLaptop();
    }
    void showLaptop() {
    	System.out.println("Lenovo WorkStaion");
    }
}



public class UseofSuper {
public static void main(String[] args) {
	Lenovo i5 = new Lenovo();
	i5.price();
	i5.showLaptop();
}
}
