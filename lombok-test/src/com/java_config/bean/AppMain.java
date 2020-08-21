package com.java_config.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Object o1 = context.getBean("book");
		System.out.println(o1);
		
		Object o2 = context.getBean("bookStore");
		BookStore bookStore = (BookStore) o2;
		BookStore bs2 = context.getBean("bookStore", BookStore.class);
		System.out.println(o2);
		System.out.println(o2 == bs2);
		
		System.out.println(bookStore.getBook());
		
		System.out.println("done");
	}
}
