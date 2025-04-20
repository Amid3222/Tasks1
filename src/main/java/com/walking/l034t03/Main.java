package com.walking.l034t03;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        searchDifferenceBetweenDates("20.12.2022 20:16:00", "28.06.1932 02:51:56");
    }

    public static void searchDifferenceBetweenDates(String firstDate, String secondDate) {
        LocalDateTime fDate = getLocalDateTime(firstDate);
        LocalDateTime sDate = getLocalDateTime(secondDate);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("%nSeconds: %s".formatted((fDate.toEpochSecond(ZoneOffset.UTC) - sDate.toEpochSecond(ZoneOffset.UTC))));
        stringBuilder.append("%nMinutes: %s".formatted((fDate.until(sDate, ChronoUnit.MINUTES) * -1)));
        stringBuilder.append("%nDays: %s".formatted((fDate.until(sDate, ChronoUnit.DAYS) * -1)));
        stringBuilder.append("%nMonth: %s".formatted((fDate.until(sDate, ChronoUnit.MONTHS) * -1)));
        stringBuilder.append("%nYears: %s".formatted((fDate.until(sDate, ChronoUnit.YEARS) * -1)));
        System.out.println(stringBuilder);
    }

    private static LocalDateTime getLocalDateTime(String timeVariable) {
        return LocalDateTime.parse(timeVariable, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
    }
}
