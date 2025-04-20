package com.walking.l018t1;

/*В main() создать и наполнить в произвольном порядке
 * объектами разных классов-наследников массив типа Animal.
 * Реализовать метод, принимающий массив Animal и вызывающий метод,
 * характерный для конкретного животного.
  использовать instaceOf и getclass*/
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
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
