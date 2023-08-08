package com.overrriding;
//rule1
class Veheecle{
	public void drive() {
		System.out.println("Four Wheeler");
	}
}

class Caar extends Veheecle{
	@Override
	public void drive() {
		System.out.println("Benz-GLA");
	}
}


//rule2
class Vehicles{
//	public void drive() {
//		 void drive() {
			protected void drive() {
		System.out.println("Four Wheeler");
	}
}

class Caars extends Vehicles{
	@Override
//	protected void drive() {
//		protected void drive() {
			public void drive() {
		System.out.println("Benz-GLA");
	}
}
public class OverridingMethod {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
//		v1.drive();
		Caars c1 = new Caars();
		c1.drive();
	}
	

}
