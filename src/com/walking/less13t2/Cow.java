package com.walking.less13t2;

public class Cow extends Animal {
    @Override
    protected void sound() {
        System.out.println("moo!");
    }

    public void moo() {
        super.sound();
    }
}
