package com.walking.l20t3;

public class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public void meow() {
        sound();
    }
}
