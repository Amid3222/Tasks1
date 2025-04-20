package com.walking.l018t1;

public class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public void meow() {
        sound();
    }
}
