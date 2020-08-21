package com.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext conntext = new ClassPathXmlApplicationContext("root-annotaion.xml");
		
		Object o1 = conntext.getBean("book");
		Object o2 = conntext.getBean("bookStore");
		
		BookStore bs = (BookStore) o2;
		System.out.println(bs.getBook());
		
		System.out.println("done");
	}
}
