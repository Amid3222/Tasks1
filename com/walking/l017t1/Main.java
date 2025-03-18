package com.walking.l017t1;

import java.util.Scanner;

public class Main {

    static String checkWord(String userWord) {
        String result = "";
        for (Words word : Words.values()) {
            result = (userWord.equals(word.getWord())) ? word.getRightWord() : Words.UNKOWN.getWord();
            if (!result.equals(Words.UNKOWN.getWord())) break;
        }
        return result;
    }

    Words exmple = Words.BYE;
    String  sz = exmple.getRightWord();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String userWord = scanner.nextLine();
        scanner.close();
        System.out.println(checkWord(userWord));
    }
}