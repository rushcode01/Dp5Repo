package com.basic;

public class ConcatTeat1 {
	public static void main(String[] args) {
		String s1 = "welcome";

		s1.concat("to TQ");//heap - welcome toTQ -unref(going for Gc) | scp to TQ 

		System.out.println(s1);

		s1 = s1.concat(" to pune");// heap - welcome to pune (ref by s1)  | scp - to pune
		System.out.println(s1);
	}
}
