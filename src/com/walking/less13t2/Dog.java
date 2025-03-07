package com.walking.less13t2;

public class Dog extends Animal {

    @Override
    protected void sound() {
        System.out.println("woof!");
    }

    public void woof() {
        super.sound();
    }
}