package com.java_config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration	// 설정 역활을 하겠다.
public class AppConfig {
	
	@Bean
	public Book book() {
		return new Book();
	}
	
	@Bean
	public BookStore bookStore(Book book) {
		BookStore bs = new BookStore();
		bs.setBook(book);
		return bs;
	}
}
