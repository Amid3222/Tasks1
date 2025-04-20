package com.walking.l20t3;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    public void woof() {
        sound();
    }
}