package com.xworkz.librarymanagement.DTO;


public class BookDTO {

	private int bookId;
	private String bookName;
	private double bookPrice;
	private String bookPublisher;
	private String bookAuthorName;
	private int bookEdition;
	
	


	// default Constructor
	public BookDTO() {
		
	}

	
	// Using get() & set()....
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

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getBookAuthorName() {
		return bookAuthorName;
	}

	public void setBookAuthorName(String bookAuthorName) {
		this.bookAuthorName = bookAuthorName;
	}
	
	public int getBookEdition() {
		return bookEdition;
	}


	public void setBookEdition(int bookEdition) {
		this.bookEdition = bookEdition;
	}


	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookPublisher="
				+ bookPublisher + ", bookAuthorName=" + bookAuthorName + ", bookEdition=" + bookEdition + "]";
	}
	
	
	
	
}
