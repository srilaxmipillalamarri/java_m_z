package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zensar.api.Book;



public class RowMapperImpl implements RowMapper<Book> {

	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setBookNo(rs.getInt(1));
		book.setBookName(rs.getString(2));
		book.setBookCost(rs.getInt(3));
		return book;
	}

}