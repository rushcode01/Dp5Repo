package com.arrayObject.arraylab.dao;

import java.util.Arrays;

import com.arrayObject.arraylab.model.Books;

public class BookDAO extends Books {
	public BookDAO() {

	}

	public static Books bookArr[] = new Books[5];

	BookDAO(int bookId, String bookName, float bookPrice, Books bookType[]) {
		super(bookId, bookName, bookPrice);
		BookDAO.bookArr = bookType;

	}

	static int index = 0;

	public void addBook(Books book) {

		bookArr[index++] = book;

	}

	public boolean modifyBookName(int bookId, String bookName) {

		for (int i = 0; i < index; i++) {
			if (bookArr[i].getBookId() == bookId) {
				bookArr[i].setBookName(bookName);
				return true;
			}
		}

		return false;

	}

	public void modifyBookPrice(int bookId, float bookPrice) {
		for (int i = 0; i < index; i++) {
			if (bookArr[i].getBookId() == bookId) {
				bookArr[i].setBookPrice(bookPrice);
			}
		}
	}


	public  Books[] getAllbooks() {
		
		return bookArr;
	}
	
	
}
