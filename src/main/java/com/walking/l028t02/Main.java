package com.walking.l028t02;

public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> wrap = new Wrapper<>();
        Integer integer = 12;
        wrap.setObject(integer);
        System.out.println(wrap.getObject());

        Wrapper<TestObj> wrap1 = new Wrapper<>();
        TestObj testObj = new TestObj();
        wrap1.setObject(testObj);
        System.out.println(wrap1.getObject());
    }


}
