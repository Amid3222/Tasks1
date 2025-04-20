package com.walking.l016t3;

public class Main {
    static void makeSounds(Animal... animals) {
        for (Animal m : animals) m.makeSound();
    }

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        makeSounds(animals);
    }
}