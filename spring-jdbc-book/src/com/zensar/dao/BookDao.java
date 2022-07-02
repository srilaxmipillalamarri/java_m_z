package com.zensar.dao;



import java.util.List;

import com.zensar.api.Book;



public interface BookDao {
     public  int insertBook(Book book);
     public Book getBook(int bookNo);
      public int updateBook( Book book);
      public  int deleteBook(int bookNo);
	
}
