package com.walking.less13t1;

public class Cat extends Animal {
    public Cat(String color) {
        this();
        System.out.printf("I’m %s cat \n", color);
    }

    private Cat() {
        super();
        System.out.println("I’m cat");
    }
}