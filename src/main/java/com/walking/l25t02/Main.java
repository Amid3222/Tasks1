package com.walking.l25t02;

public class Main {
    public static void callSound(SomeAnimal... animals) {
        for (SomeAnimal animal : animals) {
            animal.sound();
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        SomeAnimal cow = animal.new Cow();
        SomeAnimal dog = animal.new Dog();
        callSound(cow, dog);
    }
}