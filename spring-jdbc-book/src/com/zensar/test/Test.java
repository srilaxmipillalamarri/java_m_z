package com.zensar.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.api.Book;
import com.zensar.dao.BookDao;
import com.zensar.dao.BookDaoImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("applicationcontext loaded.....");
		BookDaoImpl bookDaoImpl = context.getBean("BookDaoImpl", BookDaoImpl.class);

		// ------CREATE NEW Book--------

		Book book = new Book();
		book.setBookNo(02);
		book.setBookName("ocean");
		book.setBookCost(3200);
		int result = bookDaoImpl.insertBook(book);
		System.out.println("Book added " + result);

		// -----------UPDATE THE Book------

		/*
		 * Book book = new Book(); book.setBookNo(01); book.setBookName("ramayanam");
		 * book.setBookCost(3600); int result = bookDaoImpl.updateBook(book);
		 * System.out.println("Book data updated " + result);
		 */

		// -------DELETE THE Book--------

		/*
		 * int result = bookDaoImpl.deleteBook(01); System.out.println("Deleted " +
		 * result);
		 */

		
		 // Book book = bookDaoImpl.getBook(1); System.out.println(book);
		 
	}
}
