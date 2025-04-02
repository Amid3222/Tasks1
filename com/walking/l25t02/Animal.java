
package com.walking.l25t02;

public class Animal {
    public class Cow implements SomeAnimal {
        @Override
        public void sound() {
            System.out.println("moo!");
        }
    }

    public class Dog implements SomeAnimal {
        @Override
        public void sound() {
            System.out.println("woof!");
        }
    }
}