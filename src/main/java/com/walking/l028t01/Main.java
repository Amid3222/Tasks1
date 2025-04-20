package com.walking.l028t01;

public class Main {
    public static void main(String[] args) {
        MyGeneric<Float> myGeneric = new MyGeneric<>(23.12F);
        System.out.println(myGeneric.raiseDegree(2));
        MyGeneric<Integer> myGeneric1 = new MyGeneric<>(15);
        System.out.println(myGeneric1.raiseDegree(3));
    }
}
