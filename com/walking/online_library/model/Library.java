package com.walking.online_library.model;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> TakenBooks = new ArrayList<>();

    public Library() {
        books.add(new Book("George Orwell", "1984"));
        books.add(new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone"));
        books.add(new Book("J.R.R. Tolkien", "The Hobbit"));
        books.add(new Book("Harper Lee", "To Kill a Mockingbird"));
        books.add(new Book("F. Scott Fitzgerald", "The Great Gatsby"));
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> getTakenBooks() {
        return TakenBooks;
    }

}
