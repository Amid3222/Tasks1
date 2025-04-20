package com.walking.l034t01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String timeString = "20.12.2022 20:16:00";
        getStringToTime(timeString);
    }

    private static void getStringToTime(String timeString) {
        LocalDateTime time = LocalDateTime.parse(timeString, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        System.out.println(time.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
