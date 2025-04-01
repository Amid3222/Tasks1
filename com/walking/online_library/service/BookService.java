package com.walking.online_library.service;

import com.walking.online_library.model.Book;
import com.walking.online_library.model.Library;
import com.walking.online_library.model.TakenBook;
import com.walking.online_library.model.User;

public class BookService {
    private static final Library lib = new Library();
    private User user;

    public User setUser(User user) {
        this.user = user;
        return user;
    }

    public static String getListOfAvailableBooks() {
        StringBuilder sb = new StringBuilder();
        for (Book b : lib.getBooks()) sb.append(b.toString());
        return sb.toString();
    }

    public String getBookById(String id) {
        for (Book b : lib.getBooks()) if (b.getId().equals(id)) return b.getName();
        return null;
    }


    public String findBook(String name) {
        for (Book b : lib.getBooks()) {
            if (b.getName().equals(name)) {
                getChosenBookToUser(b);
                System.out.println("The book is taken " + b.toString() + " // " + user.toString());
                return "The book is taken " + b.toString();
            }
        }
        return "Book not found";
    }

    public void getChosenBookToUser(Book b) {
        user.getPersonalBooks().add(new TakenBook(b));
        lib.getTakenBooks().add(b);
        lib.getBooks().remove(b);
    }

    public String getUserBooksLib() {
        StringBuilder sb = new StringBuilder();
        if (user.getPersonalBooks().isEmpty()) return "Books does not exist";
        for (TakenBook b : user.getPersonalBooks()) sb.append(b.toString());
        return sb.toString();
    }

    public String takeBookToLib(String id) {
        boolean flag = false;
        TakenBook b2 = null;
        for (TakenBook b : user.getPersonalBooks()) {
            if (b.getBook().getId().equals(id)) {
                lib.getTakenBooks().remove(b.getBook());
                lib.getBooks().add(b.getBook());
                flag = true;
                b2 = b;
            }
        }
        if (flag) user.getPersonalBooks().remove(b2);
        if (flag) return "The book is returned";
        else return "Id is wrong";
    }
}
