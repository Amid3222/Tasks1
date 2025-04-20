package com.walking.l37t01.counterAggregation;

public class Counter {

    //поля
    private final String nameCounter;  //поля счетчика
    private int value = 0;
    private final String METRIC;

    //конструкторы
    public Counter(String nameCounter,String metric) {
        this.nameCounter = nameCounter;
        this.METRIC = metric;
    }

    public Counter(String nameCounter, int value, String metric) {
        this.nameCounter = nameCounter;
        this.value = value;
        this.METRIC = metric;
    }

    //геттеры и сеттеры
    public String getName() {
        return this.nameCounter;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int x) {
        this.value = x;
    }

}
