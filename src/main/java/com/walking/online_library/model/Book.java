package com.walking.online_library.model;

import java.util.Objects;
import java.util.Random;

public class Book {
    private final String name;
    private final String author;
    private final String id;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
        this.id = String.valueOf(new Random().nextInt(100));
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + " " + " Author: " + author + "\n";
    }
}
