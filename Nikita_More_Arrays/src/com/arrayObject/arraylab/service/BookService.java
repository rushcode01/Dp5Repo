package com.arrayObject.arraylab.service;

import com.arrayObject.arraylab.dao.BookDAO;
import com.arrayObject.arraylab.model.Books;

public class BookService {

	static BookDAO bd  = new BookDAO();

	public void addBookService(Books bookArr) {
      bd.addBook(bookArr);
	}
	public void modifyBookNameService(Books bookArr) {
		bd.modifyBookName(bookArr.getBookId(), bookArr.getBookName());
	}
	public void modifyBookPriceService(Books bookArr) {
		bd.modifyBookPrice(bookArr.getBookId(), bookArr.getBookPrice());
	}
	public Books[] getAllBooksService() {
		return bd.getAllbooks();
	}
}
