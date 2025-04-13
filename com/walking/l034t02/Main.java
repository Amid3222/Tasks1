package com.walking.l034t02;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        x(scanner.nextLine());
        scanner.close();
    }

    public static void x(String inputTime) {
        LocalDateTime userTime = LocalDateTime.parse(inputTime, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        if (!LocalDateTime.now().equals(userTime)) System.out.println("Является!");
        else System.out.println("Не является");
    }
}
