package com.walking.l039t02;

public class Main {
    public static void main(String[] args) {
        FuckingStack<Integer> fuckingStack = new FuckingStack<>(0);
        fuckingStack.add(1);
        fuckingStack.add(4);
        fuckingStack.add(3);
        fuckingStack.add(2);
        System.out.println(fuckingStack);
        fuckingStack.removeLast();
        System.out.println(fuckingStack);
    }
}
