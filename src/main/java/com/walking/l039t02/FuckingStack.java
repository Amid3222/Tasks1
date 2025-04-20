package com.walking.l039t02;

import com.sun.jdi.InvalidStackFrameException;
import com.walking.l039t01.SinglyLinkedList;

public class FuckingStack<T> extends SinglyLinkedList<T> {

    public FuckingStack(T element) {
        super(element);
    }

    @Override
    public void add(T element) {
        super.add(element);
    }

    public void removeLast() throws InvalidStackFrameException {
       super.removeLast();
    }

    @Override
    public int getDeep() {
        return super.getDeep();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
