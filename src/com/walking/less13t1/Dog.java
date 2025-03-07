package com.walking.less13t1;

public class Dog extends Animal {
    public Dog(String color){
        this();
        System.out.printf("I’m %s dog \n", color);
    }

    private Dog() {
        super();
        System.out.println("I’m dog");
    }
}