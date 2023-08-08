package com.ContaintmentGetterSetter;

class Engine {
	private String type;

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public String toString() {
		return " " + type;
	}
}

public class Car {
	private int model_no;
	private String name;
	private int price;
	Engine e;

	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public int getModel_no() {
		return model_no;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Engine getE() {
		return e;
	}

	public String toString() {
		return " " + model_no + " " + name + " " + price + " " + e;
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.setModel_no(0007);
		c1.setName("Audi R8");
		c1.setPrice(20000000);
		c1.setE(new Engine());
		
		c1.getE().setType("5.2L V10 FSI");
		System.out.println(c1);
		
		
	}
}
