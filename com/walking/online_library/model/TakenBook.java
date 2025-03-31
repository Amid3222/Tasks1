package com.walking.online_library.model;

import java.time.LocalDateTime;

public class TakenBook extends Book {

    private LocalDateTime TakenAss;

    public TakenBook(Book book) {
        super(book.getAuthor(), book.getName());
        this.TakenAss = LocalDateTime.now();
    }

    public LocalDateTime getTakenAss() {
        return TakenAss;
    }
}
