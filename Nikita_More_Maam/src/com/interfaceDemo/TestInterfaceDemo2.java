package com.interfaceDemo;

interface Language {
	void showName(String name);
}

class ProgrammingLanguage implements Language {
	public void showName(String name) {
		System.out.println("Prigraming Language " + name);
	}
}

class CommunicationLanguage implements Language {
	public void showName(String name) {
		System.out.println("Communication Language " + name);
	}
}

public class TestInterfaceDemo2 {
	public static void main(String[] args) {
		Language l1 = new ProgrammingLanguage();
		l1.showName("java");
		Language l2 = new CommunicationLanguage();
		l2.showName("Marathi");
	}
}
