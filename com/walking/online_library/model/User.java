package com.walking.online_library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private int password;
    private List<TakenBook> personalBooks = new ArrayList<>();
    public boolean isUserBanned = false;

    public User(String name, int pass) {
        this.name = name;
        this.password = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return password == user.password && Objects.equals(name, user.name);
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public List<TakenBook> getPersonalBooks() {
        return personalBooks;
    }

}
