package com.walking.online_library.service;

import com.walking.online_library.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserLogin {
    static List<User> userlist = new ArrayList<>();

    public static boolean isCreateNewUser(User user){
        if (userlist.contains(user)) return false;
        userlist.add(user);
        return true;
    }

    public static List<User> getUserlist() {
        return userlist;
    }

    public static User foundUserInList(String name, int pass){
        for (User u : userlist) if (u.hashCode()== Objects.hash(name, pass)) return u;
        return null;
    }

}
