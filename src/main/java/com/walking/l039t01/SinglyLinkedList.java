package com.walking.l039t01;

import com.sun.jdi.InvalidStackFrameException;


public class SinglyLinkedList<T> {

    private Node<T> node;
    private int deepSize = 0;

    public SinglyLinkedList(T element) {
        this.node = new Node<>(element, null);
    }

    public Node<T> getNode() {
        return node;
    }

    public class Node<T> {
        public T element;
        public Node<T> linkToNext;

        public Node(T element, Node<T> linkToNext) {
            this.element = element;
            this.linkToNext = linkToNext;
        }

        public Node<T> getLinkToNext() {
            return linkToNext;
        }

        public void setLinkToNext(Node<T> linkToNext) {
            this.linkToNext = linkToNext;
        }
    }

    public void add(T element) {
        node = new Node<>(element, node);
        deepSize++;
    }

    private Node<T> reverseRecursive(Node<T> current, Node<T> prev) {
        if (current == null) {
            return prev;
        }
        Node<T> next = current.linkToNext;
        current.linkToNext = prev;
        return reverseRecursive(next, current);
    }

    public void reverseList() {
        node = reverseRecursive(node, null);
    }

    public void removeALL() {
        Node<T> currentNode = node;
        while (currentNode.linkToNext != null) {
            if (currentNode.element.hashCode() % 2 == 0) {
                remove(currentNode.element);
            }
            currentNode = currentNode.linkToNext;
        }
    }

    public void removeLast() {
        node = node.linkToNext;
    }

    public void removeFirst() {
        Node<T> currentNode = node;
        for (int i = 0; i < getDeep() + 1; i++) {
            if (currentNode.linkToNext.linkToNext == null) {
                currentNode.linkToNext = null;
                break;
            }
            currentNode = currentNode.linkToNext;
        }


    }

    public boolean remove(T element) throws InvalidStackFrameException {
        Node<T> currentNode = node;
        while (currentNode.linkToNext != null) {
            if (currentNode.linkToNext.element.equals(element)) {
                currentNode.linkToNext = currentNode.linkToNext.linkToNext;
                System.out.println("Removed " + currentNode.linkToNext.element + "\n");
                return true;
            }
            currentNode = currentNode.linkToNext;
        }
        return false;
    }

    private Node<T> getNext(Node<T> n) {
        return n.linkToNext;
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
        return sb.toString();
    }
}
