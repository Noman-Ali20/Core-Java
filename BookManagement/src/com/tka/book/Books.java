package com.tka.book;

public class Books {
	private String bookName;
	private String bookAuthor;
	private String publisher;
	private String category;
	private int bookId;
	private int bookPrice;
	int pages;
	
	public Books(String bookName, String bookAuthor, String publisher, String category, int id, int price,
			int pages) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.publisher = publisher;
		this.category = category;
		this.bookId = id;
		this.bookPrice = price;
		this.pages = pages;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

//	@Override
//	public String toString() {
//		return "Books [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", publisher=" + publisher + ", category="
//				+ category + ", bookId=" + bookId + ", bookPrice=" + bookPrice + ", pages=" + pages + "]";
//	}
	
	
	
}
