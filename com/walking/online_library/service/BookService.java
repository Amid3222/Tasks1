package com.walking.online_library.service;

import com.walking.online_library.model.Book;
import com.walking.online_library.model.Library;
import com.walking.online_library.model.TakenBook;
import com.walking.online_library.model.User;

public class BookService {
    private static Library lib = new Library();

    private User user;
    public UserService userService;

    public BookService(User u) {
        this.user = u;
        this.userService = new UserService(u);
    }

    public void showLib() {
        System.out.println("Библиотека база " + lib.getBooks());
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
        if (userService.isDaysExpiredOnAnyBook()) userService.addViolation();
        if (userService.checkBan()) return "You can't use the library.";
        else if (userService.isMoreThan3Books())
            return ("You have taken the maximum number of books, to take a new book, return one of them.");
        else {
            boolean res = false;
            for (Book b : lib.getBooks()) {
                if (b.getName().equals(name)) {
                    getChosenBookToUser(b);
                    res = true;
                    System.out.println("The book is taken " + b.toString() + " // " + user.toString());
                    return "The book is taken " + b.toString();
                }
            }
            if (!res) return "Book not found";
        }
        return null;
    }

    public void getChosenBookToUser(Book b) {
        user.getPersonalLibOfUser().add(new TakenBook(b));
        lib.getTakenBooks().add(b);
        lib.getBooks().remove(b);
        //System.out.println("книга добавлена");
    }

    public String getUserBooksLib() {
        StringBuilder sb = new StringBuilder();
        for (TakenBook b : user.getPersonalLibOfUser()) sb.append(b.toString());
        return sb.toString();
    }

    public String takeBookToLib(String id) {
        boolean flag = false;
        TakenBook b2 = null;
        for (TakenBook b : user.getPersonalLibOfUser()) {
            if (b.getBook().getId().equals(id)) {
                lib.getTakenBooks().remove(b.getBook());
                lib.getBooks().add(b.getBook());
                flag = true;
                b2 = b;
            }
        }
        if (flag) user.getPersonalLibOfUser().remove(b2);
        if (flag) return "The book is returned";
        else return "Id is wrong";
    }
}
