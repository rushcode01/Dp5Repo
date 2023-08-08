package com.abstractionAssignment;

abstract class Equipment {

	public void fill() {
		System.out.println("Fill method");
	}

	public abstract void mix();

}

class Cement_mixer extends Equipment {
	public void mix() {
		System.out.println("mix method");
	}

	public void pour() {
		System.out.println("poue method");
	}

	public class EqupmentInfo {
		public static void main(String[] args) {
			Cement_mixer c1 = new Cement_mixer();
			c1.fill();
			c1.mix();
			c1.pour();

			Equipment e = new Cement_mixer();
			e.mix();
			e.fill();
			// e.pour(); not access by Cement_mixer

		}

	}
}
