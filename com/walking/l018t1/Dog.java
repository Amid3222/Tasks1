package com.walking.l018t1;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    public void woof() {
        sound();
    }
}