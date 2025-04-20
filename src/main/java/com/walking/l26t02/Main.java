package com.walking.l26t02;

import java.util.Scanner;

public class Main {

    static String searchValueOfUnitalWords(String string) {
        String[] stringArray = string.trim().toLowerCase().split(" ");
        StringBuilder poolOfUnitalWords = new StringBuilder();
        for (String value : stringArray) {
            int counter = -1;
            for (String s : stringArray) {
                if (value.equals(s)) ++counter;
            }
            if (counter == 0) poolOfUnitalWords.append(value).append(" ");
        }
        return poolOfUnitalWords.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(searchValueOfUnitalWords(scanner.nextLine()));
    }
}
