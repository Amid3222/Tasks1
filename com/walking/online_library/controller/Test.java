package com.walking.online_library.controller;


import com.walking.online_library.model.User;
import com.walking.online_library.service.BookService;


public class Test {
    public static void main(String[] args) {
        User user1 = new User("genda", 123);
        BookService bookService = new BookService(user1);

        bookService.showLib(); //тесты
        try {
            bookService.findBook("1984");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            bookService.findBook("To Kill a Mockingbird");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            bookService.findBook("The Great Gatsby");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        bookService.userService.addViolation();
        bookService.userService.addViolation();

        try {
            bookService.findBook("Harry Potter and the Philosopher's Stone");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(user1.getPersonalLibOfUser());
        bookService.showLib();
        bookService.takeBookToLib("1984");
        bookService.showLib();
        try {
            bookService.findBook("Harry Potter and the Philosopher's Stone");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
