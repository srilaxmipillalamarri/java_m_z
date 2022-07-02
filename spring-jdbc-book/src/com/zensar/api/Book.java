package com.zensar.api;

public class Book {
	private int bookNo;
	private String bookName;
	private int bookCost;
	public Book() {
		super();
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookCost() {
		return bookCost;
	}
	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookName=" + bookName + ", bookCost=" + bookCost + "]";
	}
}
