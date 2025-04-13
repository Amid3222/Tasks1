package com.walking.l30t02;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String fullName = "малышев-котлинов станислав джавович";
        System.out.println(validateFullNames(fullName).toString());
    }

    public static FullName validateFullNames(String fullName) throws InputValidationException {
        if (Pattern.matches("[а-я]+-?[а-я]+?\\s[а-я]+\\s[а-я]+", fullName)) return new FullName(fullName.split(" "));
        else throw new InputValidationException("Wrong name");
    }
}
