//1) WAP to create a class Kid with method readBook() and another method readBook () with 2
//parameters. The method readBook here is over-loaded (same method name but different
//parameters) Create a class BigKid which extends Kid created above. Implement readBook() 
//differently in BigKid class. Here the method readBook() has been over-ridden in the child 
//class BigKid()

package com.overrriding;

class Kid {
	String bookName;
	String bookAuthor;

	public void readBook() {
		System.out.println("Kid read a book");
	}

	public void readBook(String bookName, String bookAuthor) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
}

class BigKid extends Kid {
	@Override
	public void readBook() {
		System.out.println("BigKid are Reading");
	}

	@Override
	public void readBook(String bookName, String bookAuthor) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	public String toString() {
		return "Book Name: "+bookName + "   Author Name: "+ bookAuthor;
	}

}

public class KidInfo {
	public static void main(String[] args) {
       BigKid b1 = new BigKid();
       b1.readBook();
       b1.readBook("2States"," Chetan Bhagat");
       System.out.println(b1);
       
       
	}

}
