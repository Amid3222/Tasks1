package com.walking.l029t01;

public class Main {

    public static <V> V param(ParametricType<V> obj, V v) {
        if (obj.getField()!=null) return obj.getField();
        return v;
    }

    public static void main(String[] args) {
    ParametricType<String> parametricType = new ParametricType<>();

    parametricType.setField("hui");
    parametricType.setField(null);
    System.out.println(param(parametricType, "123"));
    }
}
