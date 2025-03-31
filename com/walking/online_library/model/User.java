package com.walking.online_library.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int pass;
    private List<TakenBook> personalLibOfUser = new ArrayList<>();
    public boolean isUserBanned = false;

    public User(String name, int pass) {
        this.name = name;
        this.pass = pass;
    }

    public List<TakenBook> getPersonalLibOfUser() {
        return personalLibOfUser;
    }

}
