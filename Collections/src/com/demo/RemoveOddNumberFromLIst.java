package com.demo;

import java.util.*;

public class RemoveOddNumberFromLIst {
	public static void main(String[] args) {

		ArrayList<Integer> numlist = new ArrayList<Integer>();

		numlist.add(10);
		numlist.add(45);
		numlist.add(30);
		numlist.add(57);
		numlist.add(78);
		numlist.add(56);

		Iterator<Integer> itr = numlist.iterator();

		while (itr.hasNext()) {
			if (itr.next() % 2 != 0) {
				// numlist.remove(itr.next());//throws ConcurrentModificationException
				itr.remove();
			}
		}
		System.out.println("-----after removing add number-----");
		for (Integer n : numlist) {
			System.out.println(n);
		}

	}
}
