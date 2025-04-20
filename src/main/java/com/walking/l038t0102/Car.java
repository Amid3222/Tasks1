package com.walking.l038t0102;

public final class Car {

    private final String name;
    private final int year;
    private final String number;
    private final Colors color;
    private final int hashValue;

    public Car(String name, int year, String number, String color) {
        this.name = name;
        this.year = year;
        this.number = number;
        this.color = Colors.valueOf(color);
        this.hashValue = number.hashCode() + year * 31;
    }

    public Colors getColor() {
        return color;
    }

    public Car(int year, String number) {
        this.year = year;
        this.color = Colors.UNITED;
        this.name = "Unknown";
        this.number = number;
        this.hashValue = number.hashCode() + year * 31;
    }

    @Override
    public String toString() {
        return """     
                Марка: %s
                Год: %d
                Номер: %s
                Цвет: %s
                """.formatted(this.getName(),this.getYear(), this.getNumber(), this.color);
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
