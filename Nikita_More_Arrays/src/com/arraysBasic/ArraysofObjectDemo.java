package com.arraysBasic;

class Food {
	int foodid;
	String foodName;
	double foodPrice;

	public Food(int foodid, String foodName, double foodPrice) {
		this.foodid = foodid;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	@Override
	public String toString() {
		return "Food id = " + foodid + ", Food Name = " + foodName + ", Food Price = " + foodPrice;
	}
}

public class ArraysofObjectDemo {
	public static void main(String[] args) {
		Food foods[];
		foods = new Food[5];

		System.out.println("==========food Details==========");
		for (Food f : foods) {
			System.out.println(f);
		}
		foods[0] = new Food(1, "Pav Bhaji", 100);
		foods[1] = new Food(2, "Pani Puri", 30);
		foods[2] = new Food(3, "Dahi Bhalla", 50);
		foods[3] = new Food(4, "Paratha", 90);
		foods[4] = new Food(5, "Masala Dosa", 120);

//   case1
		System.out.println("Case1");
		System.out.println(foods[0].foodid);
		System.out.println(foods[0].foodName);
		System.out.println(foods[0].foodPrice);
		System.out.println("-------------------------");
//   case 2
		System.out.println("============Case2=============");
		System.out.println(foods[0].getFoodid());
		System.out.println(foods[0].getFoodName());
		System.out.println(foods[0].getFoodPrice());
		System.out.println("-------------------------");
//   case3
		System.out.println("===============Case3=================");
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i].getFoodid());
			System.out.println(foods[i].getFoodName());
			System.out.println(foods[i].getFoodPrice());
			System.out.println("-------------------------");
		}
//   case 4
		System.out.println("=============Case4===========");
		for (Food f : foods) {
			System.out.println(f.getFoodid());
			System.out.println(f.getFoodName());
			System.out.println(f.getFoodPrice());
			System.out.println("-------------------------");
		}
//		case5
		System.out.println("==============Case5================");
		for(int i =0; i<foods.length; i++) {
			System.out.println(foods[i]);
			System.out.println("-------------------------");
		}
	}
}
