//Create a class called Time, which has three private instance variables – hour, min and sec. It
//contains a method called add( ) which takes one Time object as parameter and print the
//added value of the calling Time object and passes Time object. In the main method, declare
//two Time objects and assign values using constructor and call the add() method.

package com.oopsAssignment;

class Time {
	private int hour;
	private int min;
	private int sec;

	public Time(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public void add() {
		System.out.println("Time: " + hour + " : " + min + " : " + sec);
	}
}

public class TimeInfo {
	public static void main(String[] args) {

		Time t1 = new Time(5, 40, 34);
		t1.add();
		Time t2 = new Time(12, 50, 12);
		t2.add();
	}

}
