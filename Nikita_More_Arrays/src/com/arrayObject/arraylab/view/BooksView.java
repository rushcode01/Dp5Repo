package com.arrayObject.arraylab.view;

import java.util.Arrays;
import java.util.Scanner;

import com.arrayObject.arraylab.dao.BookDAO;
import com.arrayObject.arraylab.model.Books;
import com.arrayObject.arraylab.service.BookService;

public class BooksView {
	static Scanner in = new Scanner(System.in);
     static BookService bs = new BookService();
	public static void main(String[] args) {

		char ch = 1;
		do {
			System.out.println("Choose the option:\n1.Add New Book\n2.Modify Book Name\n3.M"
					+ "odify Book price \n4.Show Books Details"  );
			int choice = in.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter the id");
				int id1 = in.nextInt();
				System.out.println("Enter the name");
				String name1 = in.next();
				System.out.println("Enter the price");
				float price1 = in.nextInt();
				bs.addBookService(new Books(id1, name1, price1));
				System.out.println("Successfully added new book");
//				System.out.println(Arrays.toString(getAllbooks()));
				break;

			case 2:

				System.out.println("Enter the id");
				int id2 = in.nextInt();
				System.out.println("Enter the name");
				String name2 = in.next();
				System.out.println("Enter the price");
				float price2 = in.nextInt();
				bs.modifyBookNameService(new Books(id2, name2, price2));
				System.out.println("Successfully modify book");
				break;

			case 3:

				System.out.println("Enter the id");
				int id3 = in.nextInt();
				System.out.println("Enter the name");
				String name3 = in.next();
				System.out.println("Enter the price");
				float price3 = in.nextInt();
				bs.modifyBookPriceService(new Books(id3, name3, price3));
				System.out.println("Successfully book added ok");
				break;
			case 4:
				Books [] b = bs.getAllBooksService();
				for (int i = 0; i < b.length; i++) {
					if(b[i] != null) {
						System.out.println(b[i]);
					}
				}
			}

			System.out.println("Enter the choice Y or y format:");
			ch = in.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
