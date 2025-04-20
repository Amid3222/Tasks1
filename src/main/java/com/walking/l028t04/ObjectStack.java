package com.walking.l028t04;

import com.sun.jdi.InvalidStackFrameException;


public class ObjectStack<T> {

    private Node<T> node;
    private int deepSize = 0;

    public ObjectStack(T element) {
        this.node = new Node<>(element, null);
    }

    private class Node<T> {
        public T element;
        public Node<T> linkToNext;

        public Node(T element, Node<T> linkToNext) {
            this.element = element;
            this.linkToNext = linkToNext;
        }
    }

    public void addToStack(T element) {
        node = new Node<>(element, node);
        deepSize++;
    }

    public void removeFromStack() throws InvalidStackFrameException {
        if (node.linkToNext != null) {
            node = node.linkToNext; //gc work?
            deepSize--;
        }
    }

    public int getDeep() {
        return deepSize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = node;
        while (current != null) {
            sb.append("|").append(current.element.toString()).append("|").append("\n");
            current = current.linkToNext;
        }
        sb.append("-----");
        return sb.toString();
    }
}
