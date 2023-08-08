package com.interfaceDemo;

class Phone {
	public void call() {
		System.out.println("Calling ");
	}

	public void msg() {
		System.out.println("Masseging");
	}
}

interface Camera {
	void click();

	void recordVideo();
}

interface musicPlayer {
	void play();

	void Pause();

	void stop();
}

class SmartPhone extends Phone implements Camera, musicPlayer {

	@Override
	public void click() {
		System.out.println("Clicking Photos");
	}

	@Override
	public void recordVideo() {
		System.out.println("Record video");
	}

	@Override
	public void play() {
		System.out.println("Play Music");
	}

	@Override
	public void Pause() {
		System.out.println("Pause Music");
	}

	@Override
	public void stop() {
		System.out.println("Stop Music");
	}
}

public class TestMultipleInharitance {
	public static void main(String[] args) {

		SmartPhone s = new SmartPhone();
		s.call();
		s.msg();
		s.click();
		s.recordVideo();
		s.play();
		s.Pause();
		s.stop();
	}
}
