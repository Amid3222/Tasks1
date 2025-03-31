package com.walking.online_library.service;

import com.walking.online_library.model.TakenBook;
import com.walking.online_library.model.User;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class UserService {
    private final User user;
    private int violationCounter = 0;

    public UserService(User user) {
        this.user = user;
    }

    public boolean checkBan() {
        return user.isUserBanned;
    }

    public boolean isMoreThan3Books() {
        return user.getPersonalLibOfUser().size() >= 3;
    }

    public void addViolation() {
        ++violationCounter;
        if (violationCounter >= 2) user.isUserBanned = true;
    }

    public boolean isDaysExpiredOnAnyBook() {
        for (TakenBook book : user.getPersonalLibOfUser())
            if (ChronoUnit.DAYS.between(book.getTakenAss(), LocalDateTime.now()) >= 14) return true;
        return false;
    }


}
