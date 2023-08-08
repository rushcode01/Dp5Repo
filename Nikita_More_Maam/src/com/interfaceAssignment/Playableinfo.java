//4.	 Write a Java program to create an interface Playable with a method play()
//that takes no arguments and returns void. Create three classes Football, Volleyball,
//and Basketball that implement the Playable interface and override the play() method 
//to play the respective sports.
package com.interfaceAssignment;

interface Playable {
	public void play();
}

class Football implements Playable {
	public void play() {
		System.out.println("Pla"
				+ "y FootBall");
	}
}

class Volleyball implements Playable {
	public void play() {
		System.out.println("Play Volleyball");
	}
}

class Basketball implements Playable {
	public void play() {
		System.out.println("Play Basketball");
	}
}

public class Playableinfo {
	public static void main(String[] args) {

		Football f = new Football();
		f.play();
		Volleyball v = new Volleyball();
		v.play();
		Basketball b = new Basketball();
		b.play();
		
	}
}
