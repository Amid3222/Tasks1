package com.walking.l039t01;

import java.util.Objects;

public class Node<T> {
    public Node<T>  linkToNext;
    public T obj;

    public Node(Node<T> linkToNext, T obj) {
        this.linkToNext = linkToNext;
        this.obj = obj;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(linkToNext, node.linkToNext) && Objects.equals(obj, node.obj);
    }
}
