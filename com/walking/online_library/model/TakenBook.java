package com.walking.online_library.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TakenBook /*extends Book*/ {
    private Book book;
    private LocalDateTime TakenAss;

    public Book getBook() {
        return book;
    }

    public TakenBook(Book book) {
        this.TakenAss = LocalDateTime.now();
        this.book = book;
    }

    public LocalDateTime getTakenAss() {
        return TakenAss;
    }

    @Override
    public String toString() {
        return "\n" + book.toString() + "Time until return: " + ((ChronoUnit.DAYS.between(getTakenAss(), LocalDateTime.now()) - 14) * -1) + "days";
    }
}
