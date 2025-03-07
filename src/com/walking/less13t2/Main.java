package com.walking.less13t2;


public class Main {
    public static void callSound(Animal... animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    public static void main(String[] args) {
        Cow cow = new Cow();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal[] animals = {cow, dog, cat};
        callSound(animals);
    }
}

