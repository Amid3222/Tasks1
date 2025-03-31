package com.walking.online_library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private int pass;
    private List<TakenBook> personalLibOfUser = new ArrayList<>();
    public boolean isUserBanned = false;

    public User(String name, int pass) {
        this.name = name;
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return pass == user.pass && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pass);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public List<TakenBook> getPersonalLibOfUser() {
        return personalLibOfUser;
    }

}
