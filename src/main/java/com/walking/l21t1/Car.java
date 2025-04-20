package com.walking.l21t1;

public final class Car {
    private final String name;
    private final int year;
    private final String number;
    private final int hashValue;

    public Car(String name, int year, String number) {
        this.name = name;
        this.year = year;
        this.number = number;
        this.hashValue = number.hashCode() + year * 31;
    }

    public Car(int year, String number) {
        this.year = year;
        this.name = "Unknown";
        this.number = number;
        this.hashValue = number.hashCode() + year * 31;
    }

    public Car getCar() {
        return new Car(12, "хуй");
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
        return Integer.hashCode(hashValue);
    }

    //override toString
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return obj instanceof Car car && (this.number.equals(car.number) && this.year == car.year);
    }
}
