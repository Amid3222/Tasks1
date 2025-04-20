package com.walking.l029t02;

public class MyGeneric<T extends Number> {
    private T number;

    public MyGeneric(T number) {
        this.number = number;
    }

    public String raiseDegree(int pow) {
        return String.valueOf(Math.pow(number.doubleValue(), pow));
    }
}
