package com.java_config.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Object o1 = context.getBean("book");
		Object o2 = context.getBean("bookStore");
		
		
		BookStore bookStore = context.getBean("bookStore",BookStore.class);
		System.out.println(bookStore.getBook());
		System.out.println(o1);
		
		System.out.println("done");
	}
}
