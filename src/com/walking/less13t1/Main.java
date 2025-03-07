package com.walking.less13t1;

import javax.naming.ServiceUnavailableException;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("gray");
        Dog dog = new Dog("red");
    }
}
/*Ответ на вопрос в конце задачи1:
Нет не такой. Но так происходит потому что при создании экземпляра <Dog>
вызывается наш конструктор с параметром, который вызывает конструктор сабкласса по умолчанию,
который в свою очередь вызывает конструктор без параметров super().*/
