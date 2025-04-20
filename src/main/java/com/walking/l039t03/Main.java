package com.walking.l039t03;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        DualList<Integer> s = new DualList<>();
        s.add(34);
        s.add(123);
        s.add(113);
        s.add(344);
        s.add(344);
        System.out.println(s.toString());
        s.reverse();
        System.out.println(s.toString());

    }
}
