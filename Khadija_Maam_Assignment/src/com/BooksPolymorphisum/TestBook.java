package com.BooksPolymorphisum;

import java.util.*;

public class TestBook {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Book b1 = new Book();
		System.out.println("Enter the Book Name:");
		String bName = in.next();
		b1.setBookName(bName);
		System.out.println("Enter the Book Price:");
		int bPrice = in.nextInt();
		b1.setBookPrice(bPrice);
		System.out.println("Enter the Author Name:");
		String aName = in.next();
		b1.setAuthorName(aName);

		System.out.println("Book Details");
		System.out.println("Book Name: " + b1.getBookName());
		System.out.println("Book Price: " + b1.getBookPrice());
		System.out.println("Author Name: " + b1.getAuthorName());
	}
}
