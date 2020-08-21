package com.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
//@Data
public class BookStore {
//	@Setter(onMethod_ = @Autowired)
	private Book book;
	
	public Book getBook() {
		return book;
	}
	
	@Autowired
	public void setBook(Book book) {
		this.book = book;
	}
}
