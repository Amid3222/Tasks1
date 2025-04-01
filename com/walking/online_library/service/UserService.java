package com.walking.online_library.service;

import com.walking.online_library.model.TakenBook;
import com.walking.online_library.model.User;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class UserService {
    private User user;
    private int violationCounter = 0;

    public void setUser(User user) {
        this.user = user;
    }

    public String doCheck() {
        if (checkBan()) return "You can't use the library.";
        if (isMoreThan3Books())
            return "You have taken the maximum number of books, to take a new book, return one of them.";
        return null;
    }

    public boolean checkBan() {
        return user.isUserBanned;
    }

    public boolean isMoreThan3Books() {
        return user.getPersonalBooks().size() >= 3;
    }

    public void addViolation() {
        ++violationCounter;
        if (violationCounter >= 2) user.isUserBanned = true;
    }

    public boolean isDaysExpiredOnAnyBook() {
        for (TakenBook book : user.getPersonalBooks())
            if (ChronoUnit.DAYS.between(book.getTakenAss(), LocalDateTime.now()) >= 14) return true;
        return false;
    }


}
