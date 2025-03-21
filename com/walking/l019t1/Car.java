package com.walking.l019t1;

public class Car {
    private final String name;
    private final int year;
    private final String number;
    private int hashCode;

    public Car(String name, int year, String number) {
        this.name = name;
        this.year = year;
        this.number = number;
        hashCode();
    }

    public Car(int year, String number) {
        this.year = year;
        this.name = "Unknown";
        this.number = number;
        hashCode();
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        if (hashCode!=0) return hashCode;
        return hashCode = Integer.hashCode(year) * 31 * number.hashCode();
    }

    //override toString
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return obj instanceof Car car && (this.number.equals(car.number) && this.year == car.year);
    }
}
