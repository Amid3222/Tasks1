package com.walking.l038t0102;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(numberFracture(o1.getNumber()), numberFracture(o2.getNumber()));
    }

    private int numberFracture(String numbers) {
        char[] number = numbers.toCharArray();
        return Integer.parseInt(number[number.length - 1] + number[number.length - 2] + "");
    }
}
