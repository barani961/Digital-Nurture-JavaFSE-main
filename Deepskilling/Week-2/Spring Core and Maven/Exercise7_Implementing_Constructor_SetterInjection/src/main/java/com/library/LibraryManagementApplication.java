package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("----- Constructor Injection -----");

        BookService constructorService =
                (BookService) context.getBean("bookServiceConstructor");

        constructorService.issueBook();

        System.out.println();

        System.out.println("----- Setter Injection -----");

        BookService setterService =
                (BookService) context.getBean("bookServiceSetter");

        setterService.issueBook();
    }
}