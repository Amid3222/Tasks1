package com.walking.l039t01;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>(0);
        singlyLinkedList.add(124);
        singlyLinkedList.add(123);
        singlyLinkedList.add(4697);
        singlyLinkedList.add(24);
        singlyLinkedList.add(771);
        System.out.println(singlyLinkedList);
        singlyLinkedList.remove(4697);
        singlyLinkedList.removeALL();
        System.out.println(singlyLinkedList);
    }
}
