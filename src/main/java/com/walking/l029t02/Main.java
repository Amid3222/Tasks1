package com.walking.l029t02;

import java.util.regex.Pattern;

public class Main {

    public static MyGeneric<?> genericReturn(MyGeneric<? extends Number> obj) {
        return obj;
    }

    public static void main(String[] args) {
        String mg = genericReturn(new MyGeneric<>(3)).raiseDegree(5);
        System.out.println(mg);
    }
}
