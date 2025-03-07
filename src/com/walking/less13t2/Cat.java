package com.walking.less13t2;

public class Cat extends Animal {

    @Override
    protected void sound() {
        System.out.println("meow!");
    }

    public void meow() {
        super.sound();
    }
}