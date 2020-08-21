package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("root.xml");
		
		Object o = context.getBean("book");
		Book b = (Book) o;
		System.out.println(b);
		
		Object o1 = context.getBean("bookStore");
		BookStore bs = (BookStore) o1;
		System.out.println(bs);
		
		BookStore bs1 = (BookStore) o1;
		System.out.println(bs1.getBook());
	}
}
