package com.zensar.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.zensar.api.Book;


public class BookDaoImpl implements BookDao {

	public int insertBook(Book book) {
		// for inserting employee
		String query = "insert into book(bookNo,bookName,bookCost) values(?,?,?)";
		int b1 = this.jdbcTemplate.update(query, book.getBookNo(), book.getBookName(),book.getBookCost());
		return b1;
	}

	public int updateBook(Book book) {
		// for updating Book
		String query = "update book set bookName=?, bookCost=? where bookNo=?";
		int b1 = this.jdbcTemplate.update(query, book.getBookName(), book.getBookCost(),
				book.getBookNo());
		return b1;
	}

	public int deleteBook(int bookNo) {
		// for deleting book
		String query = "delete from book where bookNo=? ";
		int b1 = this.jdbcTemplate.update(query, bookNo);
		return b1;
	}

	public Book getBook(int bookNo) {
		// select single book data
		String query = "select * from book where bookNo=?";
		RowMapper<Book> rowMapper = new RowMapperImpl();
		Book book = this.jdbcTemplate.queryForObject(query, rowMapper, bookNo);
		return book;
	}

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
