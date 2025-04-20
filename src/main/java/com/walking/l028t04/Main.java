package com.walking.l028t04;

public class Main {
    public static void main(String[] args) {
        ObjectStack<Integer> objectStack = new ObjectStack<>(12);
        objectStack.addToStack(2);
        objectStack.addToStack(13451353);
        objectStack.addToStack(19991353);
        objectStack.addToStack(13453);
        System.out.println(objectStack.toString());
        objectStack.removeFromStack();
        System.out.println(objectStack.toString());
    }

}
