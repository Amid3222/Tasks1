package com.walking.l016t2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        scanner.close();

        Word word;
        switch (s) {
            case "Hi":  // Если s равно "Hi"
//                Выводим в консоль "Hello"

                word = new HelloWord();
//                Вызываем оператор break, чтобы выйти из switch-case
                break;

            case "Bye":
                word = new ByeWord();
                break;

            case "How are you":
                word = new HowareoyuWord();
                break;

            default:  // Если значение s не совпадает ни с одним кейсом
                word = new UnkownWord();
        }
        System.out.println(word.getWord());
    }
}