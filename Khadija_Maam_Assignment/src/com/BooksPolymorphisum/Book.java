/*Create a class Book with the following private member variables

    String bookName
    int bookPrice 
    String authorName

Include appropriate getters and setters method.

Create a class TestBook which has the main method.  Get the details as shown in the sample input. 
Create an object for book class and assign the value for its attributes using the setters.  
Print the output as shown in the sample output using the getters method. 

Note: Use the same attribute names as given in the question and camel case notation for methods.  
Name of book and author can have space in between.*/

package com.BooksPolymorphisum;

public class Book {
	private String bookName;
	private int bookPrice;
	private String authorName;

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public String getAuthorName() {
		return authorName;
	}
}
