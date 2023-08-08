
package com.inharitance;
class Fruit{
	public void color() {
		System.out.println("Fruit Green");
	}
}
class Apple extends Fruit{
	public void color() {
		System.out.println("Apple:Red");
	}
}
class Banana extends Fruit{
	public void color() {
		System.out.println("Banana:Yello");
	}
}
public class DynamicDispatch {
public static void main(String[] args) {
	Fruit f = new Fruit();
	Apple a= new Apple();
	Banana b = new Banana();
	
	Fruit ft;
	
	ft = f;
	
	f.color();
	
	ft = a;
	
	ft.color();
}
}
