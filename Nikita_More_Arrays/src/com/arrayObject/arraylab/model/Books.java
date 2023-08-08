package com.arrayObject.arraylab.model;

public class Books {
	private int bookId;
	private String bookName;
	private float bookPrice;

	public Books() {
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Books(int bookId, String bookName, float bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "\nBook Id\t\t: " + bookId + "\nBook Name\t: " + bookName + "\nBook Price\t: " + bookPrice + "\n------------------";
	}

}
