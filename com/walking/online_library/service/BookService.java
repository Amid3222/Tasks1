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

    public void newUser(User user) {
        this.user = user;
        this.userService = new UserService(user);
    }

    public void showLib() {
        System.out.println("Библиотека база " + lib.getBooks());
    }

    public String getListOfBooks() {
        StringBuilder sb = new StringBuilder("s");
        for (Book b : lib.getBooks()) sb.append(b.toString());
        return sb.toString();
    }

    public void findBook(String name) throws Exception {
        if (userService.isDaysExpiredOnAnyBook()) userService.addViolation();
        if (userService.checkBan()) System.out.println("Вы не можете пользоваться библиотекой");
        else if (userService.isMoreThan3Books())
            throw new Exception("Вы взяли максимально число книг, чтобы взять новую книгу верните какую нибудь одну.");

        else {
            boolean res = false;
            for (Book b : lib.getBooks()) {
                if (b.getName().equals(name)) {
                    getChosenBookToUser(b);
                    res = true;
                    break;
                }
            }
            if (!res) throw new Exception("Книга не найдена");
        }
    }

    public void getChosenBookToUser(Book b) {
        user.getPersonalLibOfUser().add(new TakenBook(b));
        lib.getTakenBooks().add(b);
        lib.getBooks().remove(b);
        System.out.println("книга добавлена");
    }

    public void takeBookToLib(String name) {
        boolean flag = false;
        Book b2 = null;
        for (TakenBook b : user.getPersonalLibOfUser()) {
            if (b.getName().equals(name)) {
                lib.getTakenBooks().remove((Book) b);
                lib.getBooks().add((Book) b);
                flag = true;
                b2 = b;
            }
        }
        if (flag) user.getPersonalLibOfUser().remove(b2);
    }
}
