package com.walking.l20t3;


public class Main {
    static void validateArray(Animal[] a) {
        try {
            int counter = 0;
            for (Animal b : a) {
                if (b == null) throw new UnknownAnimalException("Этот индекс массива пуст: ", counter);
                ++counter;
            }
        } catch (UnknownAnimalException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), null};
        validateArray(animals);
        soundALL(animals);
        soundsVar2(new Boba()); //тест
        soundsVar1(new Boba());
    }

    static void soundALL(Animal[] animals) {
        for (Animal animal : animals) soundsVar2(animal);
    }

    static void soundsVar1(Object obj) {
        if (obj.getClass().equals(Cat.class)) ((Cat) obj).meow();
        else if (obj.getClass().equals(Dog.class)) ((Dog) obj).woof();
        else System.out.println("Invalid type");
    }

    static void soundsVar2(Object obj) {
        if (obj instanceof Dog castedDog) castedDog.woof();
        else if (obj instanceof Cat castedCat) castedCat.meow();
        else System.out.println("Invalid type");
    }

}
