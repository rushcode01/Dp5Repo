package com.overrriding;
class Bike {
	String color;
	int speed;
	public void BikeInfo(String color, int speed) {
		
		this.color = color;
		this.speed = speed;
	}
}

class Pulser extends Bike{
	@Override
	public void BikeInfo(String color, int speed) {
		
		System.out.println(color);
		System.out.println(speed);
	}
	
	
}
public class BikeInfo {
	public static void main(String[] args) {
		Pulser b1 = new Pulser();
		b1.BikeInfo("black", 120);
		
	}

}
